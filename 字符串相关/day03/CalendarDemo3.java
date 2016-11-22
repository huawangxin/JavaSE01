package day03;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar提供了一个set方法
 * 可以对某一个时间分量设置给定的值
 * 时间分量使用Calendar提供的若干常量
 * @author wangxin
 *
 */
public class CalendarDemo3 {
	public static void main(String args[]){
		Calendar calendar=Calendar.getInstance();
		/*
		 * 2008-08-08 20:22:35
		 * 若设置的时间单位对应的值会影响没有被设置的值，
		 * 那么该值也会对应改变的就好比，
		 * 我们设置了年月日，那么对应的周几也会跟着改变。
		 */
		calendar.set(Calendar.YEAR, 2014);
		calendar.set(Calendar.MONTH,10);
		/*
		 * 月是从0开始的，0为1月
		 * DAY_OF_MONTH  通常说的“号”
		 * DAY_OF_YEAR   通常说的第几天
		 * DAY_OF_WEER   通常说的星期几
		 */
//		calendar.set(Calendar.AM_PM, 22);
//		calendar.set(Calendar.HOUR, 8);
		calendar.set(Calendar.DAY_OF_MONTH,25);
		calendar.set(Calendar.HOUR_OF_DAY, 11);
		/*
		 * 当设置的单位对应的值超过了该单位允许的最大值时，
		 * Calendar会自动进位
		 * 这里小时会向天进位
		 * 设置星期也会影响日期
		 * 
		 */
		calendar.set(Calendar.MINUTE, 11);
		calendar.set(Calendar.SECOND, 11);
		
		
		//1表示周日 ，2表示周一
		calendar.set(Calendar.DAY_OF_WEEK, 1);
		
		Date date=calendar.getTime();
		System.out.println(date);

	}
}
