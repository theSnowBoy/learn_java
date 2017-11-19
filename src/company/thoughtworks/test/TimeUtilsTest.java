package company.thoughtworks.test;

import static org.junit.Assert.*;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import company.thoughtworks.VehicleMaintenance.TimeUtils;

public class TimeUtilsTest {
	private static Date start;
	private static Date end;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		end = sdf.parse("2030/09/01", new ParsePosition(0));
		start = sdf.parse("2029/07/08", new ParsePosition(0));
	}

	@Test
	public void testGetYearGap() {
		assertEquals(TimeUtils.getYearGap(start, end), 1);
	}

	@Test
	public void testGetMonthGap() {
		assertEquals(TimeUtils.getMonthGap(start, end), 14);
	}

	@Test
	public void testGetFirstDayOfPreMonth() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date target = sdf.parse("2030/08/01", new ParsePosition(0));
		assertEquals(TimeUtils.getFirstDayOfPreMonth(end), target);
		target = sdf.parse("2029/06/01", new ParsePosition(0));
		assertEquals(TimeUtils.getFirstDayOfPreMonth(start), target);
	}

	@Test
	public void testGetDateAfterSomeDays() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date target = sdf.parse("2030/09/15", new ParsePosition(0));
		assertEquals(TimeUtils.getDateAfterSomeDays(end, 14), target);
		target = sdf.parse("2030/10/2", new ParsePosition(0));
		assertEquals(TimeUtils.getDateAfterSomeDays(end, 31), target);
	}

	@Test
	public void testDaysBetween() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		Date target = sdf.parse("2030/09/15", new ParsePosition(0));
		assertEquals(TimeUtils.daysBetween(end, target), 14);
	}

}
