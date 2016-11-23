package day03;

import java.util.Calendar;

/**
 * 获取某一时间分量的最大值
 * 若最大值是固定的，通常我们不会调用该方法
 * @author wangxin
 *
 */
public class CalendarDemo6 {
	public static void main(String []args){
		Calendar calendar=Calendar.getInstance();
		//今年总共多少天
		int days=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("今年总共 "+days+"天");
		days=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("月底是"+days);
	}

}
