package day03;

import java.util.Calendar;

/**
 * Calendar用于操作时间API
 * 通常我们使用格里高利历法（公历）
 * @author wangxin
 *
 */
public class CalendarDemo1 {
	public static void main(String args[]){
		/*
		 * Calendar内部表示一个时间
		 * 默认创建出来的Calendar表示当前系统时间
		 */
		Calendar calendar=Calendar.getInstance();
		/*
		 * Calendar的toString是不可读的
		 */
		System.out.println(calendar.getClass().getName());
	}

}
