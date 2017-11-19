package company.thoughtworks;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class VehicleMaintenance {

	private Date currentDate;
	private List<CarInfo> allCarInfo = new LinkedList<>();
	private List<CarInfo> writtenOffList = new LinkedList<>();
	private List<CarInfo> distanceList = new LinkedList<>();
	private List<CarInfo> timeRelatedList = new LinkedList<>();

	public VehicleMaintenance(Date currentDate, List<String> cars) {
		this.currentDate = currentDate;
		if (cars != null) {
			for (String car : cars) {
				preDealCar(car);
			}
		}
	}

	public Date getCurrentDate() {
		return currentDate;
	}

	public List<CarInfo> getAllCarInfo() {
		return allCarInfo;
	}

	/*
	 * Ԥ����Ȼ����뵽CarInfo�С�
	 */
	public CarInfo preDealCar(String raw) {
		String[] data = raw.split("\\|");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date date = sdf.parse(data[1], new ParsePosition(0));
		CarInfo car = new CarInfo(data[0], date, data[2], Integer.valueOf(data[3]), data[4].equals("T"),data.length == 6 && data[5].equals("T")? true :false);
		allCarInfo.add(car);
		return car;
	}

	/*
	 * �����е��������д���
	 */
	public void remindAll(Date current, List<CarInfo> cars) {
		for (CarInfo car : cars) {
			remindOne(current, car);
		}
	}

	/*
	 * ��һ���������д���
	 */
	public void remindOne(Date current, CarInfo car) {
		if (remindWrittenOff(current, car)) {
			return;
		} else {
			if (remindDistance(current, car)) {
				return;
			} else {
				
				remindTime(current, car);
			}
		}
	}

	/*
	 * ����̱������ѹ���
	 */
	public boolean remindDistance(Date current, CarInfo car) {
		boolean isReminded = false;
		if (car.currentMiles % 10000 >= 9500 || car.currentMiles % 10000 == 0) {
			distanceList.add(car);
			isReminded = true;
		}
		return isReminded;
	}

	/*
	 * ���ڱ������ѹ���
	 */
	public boolean remindTime(Date current, CarInfo car) {
		// TODO
		int monthInterval = 0;
		if(car.isPrivate()){
			monthInterval = 3;
		}else if (car.haveHeavyRepair) {
			monthInterval = 3;// ÿ3������һ�Ρ�
		} else if (TimeUtils.getYearGap(car.purchaseDate, current) < 3) {// 3������
			monthInterval = 12;
		} else {// 3������
			monthInterval = 6;
		}
		return isSuitableTimeRemind(current, car, monthInterval);
	}

	/*
	 * �жϸ������ڣ��Ƿ���Ҫ���������ˡ�
	 * ���� ture : ���ѡ�
	 */
	public boolean isSuitableTimeRemind(Date current, CarInfo car, int monthInterval) {
		boolean isReminded = false;
		Calendar c = Calendar.getInstance();
		c.setTime(current);
		Date startDate = null; 
		int monthGap = 0;
		
		if (monthInterval == 6) {
			startDate = TimeUtils.getFirstDayOfsomeYearAfter(car.purchaseDate, 3);
			monthGap = TimeUtils.getMonthGap(startDate, current) + 1;
		} else {
			startDate = car.getPurchaseDate();
			monthGap = TimeUtils.getMonthGap(startDate, current);
		}

		if ((monthGap % monthInterval == monthInterval - 1) || (monthGap % monthInterval == 0 && c.DAY_OF_MONTH == 1)) {
			timeRelatedList.add(car);
			isReminded = true;
		}
		return isReminded;
	}

	/**
	 * �����ж��Ƿ񵽴ﱨ�޵�ʱ�䡣�����Ѿ����ޡ�
	 */
	public boolean remindWrittenOff(Date current, CarInfo car) {
		boolean isWrittenOff = false;
		int days = (car.isHaveHeavyRepair() ? 1095 : 2190);
		Date writtenOffDay = TimeUtils.getDateAfterSomeDays(car.purchaseDate, days);
		Date firstDayOfPreMonth = TimeUtils.getFirstDayOfPreMonth(writtenOffDay);

		if (current.getTime() > writtenOffDay.getTime()) {// �Ѿ�����
			isWrittenOff = true;
		} else if (current.getTime() >= firstDayOfPreMonth.getTime()) {// �ӽ����ޣ����ѣ�
			writtenOffList.add(car);
			isWrittenOff = true;
		}
		return isWrittenOff;
	}

	/*
	 * ����չʾ������Ҫ����Ľ����
	 */
	public void showAllRemind() {
		System.out.println("Reminder");
		System.out.println("==================");

		if (timeRelatedList.size() > 0) {
			System.out.println();
			System.out.println("* Time-related maintenance coming soon...");
			showRemindByBrand(timeRelatedList);
		}

		if (distanceList.size() > 0) {
			System.out.println();
			System.out.println("* Distance-related maintenance coming soon...");
			showRemindByBrand(distanceList);
		}

		if (writtenOffList.size() > 0) {
			System.out.println();
			System.out.println("* Write-off coming soon...");
			showRemindByBrand(writtenOffList);
		}
	}

	/*
	 * ��Ʒ�ƹ���
	 */
	public void showRemindByBrand(List<CarInfo> cars) {
		Map<String, List<CarInfo>> results = new TreeMap<>();
		for (CarInfo car : cars) {
			if (results.containsKey(car.brand)) {
				results.get(car.brand).add(car);
			} else {
				List<CarInfo> carsClassified = new LinkedList<>();
				carsClassified.add(car);
				results.put(car.brand, carsClassified);
			}
		}
		// ��ÿ�������ڲ��ĳ���������
		for (List<CarInfo> carList : results.values()) {
			Collections.sort(carList, new CarInfoComparator());
		}
		// ������
		for (String brand : results.keySet()) {
			StringBuilder sb = new StringBuilder(brand + ": " + results.get(brand).size() + " ");
			int count = 0;
			for (CarInfo car : results.get(brand)) {
				if (count == 0) {
					sb.append("(").append(car.carId);
					count++;
					continue;
				}
				sb.append(",").append(car.carId);
				count++;
			}
			sb.append(")");
			System.out.println(sb.toString());
		}
	}

	// ��������ʱ����ص����ݡ�
	public static class TimeUtils {

		@SuppressWarnings("deprecation")
		public static int getYearGap(Date start, Date end) {
			return end.getYear() - start.getYear();
		}

		public static int getMonthGap(Date start, Date end) {
			int yearGap = getYearGap(start, end);
			int month = end.getMonth() - start.getMonth();
			return yearGap * 12 + month;
		}

		/*
		 * ���ǰһ���µĵ�һ������ڡ�
		 */
		public static Date getFirstDayOfPreMonth(Date current) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(current);
			calendar.add(Calendar.MONTH, -1);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			return calendar.getTime();
		}

		/*
		 * �õ�������ĳ��ĵ�һ������ڡ�
		 */
		public static Date getFirstDayOfsomeYearAfter(Date current, int yearsGap) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(current);
			calendar.add(Calendar.YEAR, yearsGap);
			calendar.set(Calendar.MONTH, 0);
			calendar.set(Calendar.DAY_OF_MONTH, 1);
			return calendar.getTime();
		}

		/*
		 *�õ�ĳЩ�������ڡ�
		 */
		public static Date getDateAfterSomeDays(Date current, int days) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(current);
			calendar.add(Calendar.DATE, days);
			Date result = calendar.getTime();
			return result;
		}

		/*
		 * �����������ڼ��������
		 */
		public static int daysBetween(Date early, Date late) {
			java.util.Calendar calst = java.util.Calendar.getInstance();
			java.util.Calendar caled = java.util.Calendar.getInstance();
			calst.setTime(early);
			caled.setTime(late);
			// ����ʱ��Ϊ0ʱ
			calst.set(java.util.Calendar.HOUR_OF_DAY, 0);
			calst.set(java.util.Calendar.MINUTE, 0);
			calst.set(java.util.Calendar.SECOND, 0);
			caled.set(java.util.Calendar.HOUR_OF_DAY, 0);
			caled.set(java.util.Calendar.MINUTE, 0);
			caled.set(java.util.Calendar.SECOND, 0);
			// �õ�����������������
			int days = ((int) (caled.getTime().getTime() / 1000) - (int) (calst.getTime().getTime() / 1000)) / 3600
					/ 24;

			return days;
		}
	}

	// ���������洢 car����ص���Ϣ��
	public static class CarInfo {
		private String carId; //���ƺ�
		private Date purchaseDate; // ��������
		private String brand; // Ʒ��
		private int currentMiles; // ��ǰ�����
		private boolean haveHeavyRepair; // �Ƿ���ޣ�true ��ʾ���޹���
		private boolean isPrivate;

		public CarInfo(String carId, Date purchaseDate, String brand, int currentMiles, boolean haveHeavyRepair,boolean isPrivate) {
			this.carId = carId;
			this.purchaseDate = purchaseDate;
			this.brand = brand;
			this.currentMiles = currentMiles;
			this.haveHeavyRepair = haveHeavyRepair;
			this.isPrivate = isPrivate;
		}

		public boolean isPrivate() {
			// TODO Auto-generated method stub
			return this.isPrivate;
		}

		public String getCarId() {
			return carId;
		}

		public Date getPurchaseDate() {
			return purchaseDate;
		}

		public String getBrand() {
			return brand;
		}

		public int getCurrentMiles() {
			return currentMiles;
		}

		public boolean isHaveHeavyRepair() {
			return haveHeavyRepair;
		}

	}

	public static class CarInfoComparator implements Comparator<CarInfo> {
		@Override
		public int compare(CarInfo car1, CarInfo car2) {
			return car1.carId.compareTo(car2.carId);
		}
	}
}
