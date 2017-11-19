package company.thoughtworks.test;

import static org.junit.Assert.*;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

import org.junit.Before;
import org.junit.Test;

import company.thoughtworks.VehicleMaintenance;
import company.thoughtworks.VehicleMaintenance.CarInfo;

public class VehicleMaintenanceTest {
	private VehicleMaintenance vm = null;
	private Date currentDate = null;
	private CarInfo carTest = null;

	@Before
	public void setUpBeforeClass() {
		String current = "SubmitDate: 2030/09/01";
		List<String> cars = new LinkedList<>();
		String tmp = current.split(":")[1];
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		currentDate = sdf.parse(tmp, new ParsePosition(1));
		vm = new VehicleMaintenance(currentDate, null);
	}

	@Before
	public void setUp() throws Exception {

	}

	@Test
	public void testPreDealCar() {
		CarInfo car = vm.preDealCar("CAR0001|2025/04/05|Porsche|10000|F");
		 assertEquals(car.getCurrentMiles(), 10000);
		 assertEquals(car.getCarId(),"CAR0001");
		 String dateTest = "2025/04/05";
		 SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		 Date date = sdf.parse(dateTest, new ParsePosition(0));
		 assertEquals(car.getPurchaseDate(),date);
		 assertEquals(car.getBrand(), "Porsche");
		 assertEquals(car.isHaveHeavyRepair(), false);
	}


	@Test
	public void testRemindDistance() {
		CarInfo car1 = vm.preDealCar("CAR0001|2025/04/05|Porsche|10000|F");
		assertEquals(vm.remindDistance(currentDate, car1), true);
		car1 = vm.preDealCar("CAR0002|2029/10/14|Porsche|9000|F");
		assertEquals(vm.remindDistance(currentDate, car1), false);
	}

	@Test
	public void testRemindTime() {
		CarInfo car1 = vm.preDealCar("CAR0006|2029/07/01|Audi|10001|T");
		assertEquals(vm.remindTime(currentDate,car1), true);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date currentDate2 = sdf.parse("2050/05/01", new ParsePosition(0));
		
		car1 = vm.preDealCar("CAR0006|2046/11/15|Jeep|2000|F");
		assertEquals(vm.remindTime(currentDate2,car1), true);
		
		car1 = vm.preDealCar("CAR0007|2046/11/16|Jeep|5000|F");
		assertEquals(vm.remindTime(currentDate2,car1), true);
	}

	@Test
	public void testIsSuitableTimeRemind() {
		CarInfo car1 = vm.preDealCar("CAR0006|2029/07/01|Audi|10001|T");
//		assertEquals(vm.isSuitableTimeRemind(car1.getPurchaseDate(), currentDate), true);
	}

	@Test
	public void testIsWrittenOff() {
		CarInfo car1 = vm.preDealCar("CAR0004|2027/11/01|BYD|23000|T");
		assertEquals(vm.remindWrittenOff(currentDate, car1), true);
		car1 = vm.preDealCar("CAR0009|2024/10/22|Ford|90300|F");
		assertEquals(vm.remindWrittenOff(currentDate, car1), true);
	}

}
