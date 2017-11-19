package company.thoughtworks;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	//TODO ÕûÌåµÄ²âÊÔ¡£
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String dateStr = scan.nextLine();
			List<String> cars = new LinkedList<>();
			
			while (scan.hasNextLine()) {
				String car = scan.nextLine();
				if (car.isEmpty()) {
					break;
				}
				cars.add(car);
			}
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			Date date = sdf.parse(dateStr.split(":")[1], new ParsePosition(0));
			VehicleMaintenance vm = new VehicleMaintenance(date, cars);
			vm.remindAll(vm.getCurrentDate(), vm.getAllCarInfo());
			vm.showAllRemind();
		}
}
