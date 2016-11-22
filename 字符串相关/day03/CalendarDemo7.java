package day03;

import java.util.Calendar;

/**
 * 使用add方法对Calendar表示的时间进行计算
 * @author wangxin
 *
 */
public class CalendarDemo7 {
	public static void main(String args[]){
		Calendar calendar=Calendar.getInstance();
		//加3年
		calendar.add(Calendar.YEAR, 3);
		//加2月
		calendar.add(Calendar.MONTH, 2);
		//减30天,对天的加减只用DAY_OF_YEAR
		calendar.add(Calendar.DAY_OF_YEAR, -30);
		
		System.out.println(calendar.getTime());
		
	}
}
