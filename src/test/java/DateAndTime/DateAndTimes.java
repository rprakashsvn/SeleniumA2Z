package DateAndTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateAndTimes {

	public static void main(String[] args) {
		DateAndTimes.getCurrentDateTime();
		DateAndTimes.CalendarClassGetDateTime();
		DateAndTimes.FormatDateTime();
		DateAndTimes.setFutureDateTime();
		DateAndTimes.setPastDateTime();
		DateAndTimes.CalendarClassFormatDateTime();
		DateAndTimes.getDataTime();
		DateAndTimes.CalendarClassGetDay();
	}

	public static void getDataTime() {
		String timestamp = new SimpleDateFormat("MM_dd_yyyy_hh_mm_ss").format(new Date());
		System.out.println("Current Date & Time Is : " + timestamp);
	}

	public static void getCurrentDateTime() {
		// create a object for date class
		Date getDateTime = new Date();
		System.out.println("Current Date & Time Is : " + getDateTime);
	}

	public static void FormatDateTime() {
		// create a object for date class
		Date getDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY hh:mm:ss");
		System.out.println("Formatted Date & Time Is : " + dateFormat.format(getDate).toString());
	}

	public static void CalendarClassGetDateTime() {
		Calendar calendar = Calendar.getInstance();
		Date getDateTime = calendar.getTime();
		System.out.println("Calendar Class Get Current Date & Time Is : " + getDateTime);
	}

	public static void CalendarClassGetDay() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		// Get Current Day as a number
		int getDay = calendar.get(Calendar.DAY_OF_MONTH);
		System.out.println("Calendar Class Get Current Day Is : " + getDay);
	}

	@SuppressWarnings("static-access")
	public static void setFutureDateTime() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.DAY_OF_YEAR, 5);
		Date futureDateTime = calendar.getTime();
		System.out.println("Calendar Class Set Future Date & Time Is : " + futureDateTime);
	}

	@SuppressWarnings("static-access")
	public static void setPastDateTime() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.DAY_OF_YEAR, -3);
		Date pastDateTime = calendar.getTime();
		System.out.println("Calendar Class Set Past Date & Time Is : " + pastDateTime);
	}

	@SuppressWarnings("static-access")
	public static void CalendarClassFormatDateTime() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(calendar.DAY_OF_YEAR, -3);
		Date DateTime = calendar.getTime();
		SimpleDateFormat formatDates = new SimpleDateFormat("dd/MM/YYYY");
		System.out.println("Calendar Class Format Date & Time Is : " + formatDates.format(DateTime).toString());
	}

}
