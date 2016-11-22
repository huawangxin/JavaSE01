package day03;

import java.util.Calendar;

/**
 * Calendar的get方法
 * 可以获取当前时间Calendar所表示的时间中的某一个时间单位的值
 * @author wangxin
 *
 */
public class CalendarDemo5 {
	public static void main(String []args){
		Calendar calendar=Calendar.getInstance();
		//获取是哪一年
		int year=calendar.get(Calendar.YEAR);
		int mouth=calendar.get(Calendar.MONTH)+1;
		/*
		 * DAY_OF_MONTH
		 * DATE 与DAY_OF_MONTH功能一样
		 */
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		int hour=calendar.get(Calendar.HOUR);
		int minute=calendar.get(Calendar.MINUTE);
		int second=calendar.get(Calendar.SECOND);
		int week=calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("周"+(week==1?7:week-1));
		System.out.println(year+"-"+mouth+"-"+day);
		System.out.println(hour+":"+minute+":"+second);
	}
}
