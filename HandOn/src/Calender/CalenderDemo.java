package Calender;

import java.util.Calendar;

public class CalenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalenderDemo cd = new CalenderDemo();
		cd.getDTime();

	}
	
	public void getDTime() {
		
		Calendar calender = Calendar.getInstance();
		
		System.out.println(calender.getTime());
		
		System.out.println(calender.getFirstDayOfWeek());
		
		System.out.println(calender.getTimeZone());
		
		System.out.println(calender.getTimeInMillis());
		
		System.out.println(calender.getCalendarType());
	}

}
