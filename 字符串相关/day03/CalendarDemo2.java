package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Calendar与Date,String之间的转换
 * 三者之间的转换必须会
 * @author Administrator
 *
 */
public class CalendarDemo2 {
	public static void main(String []args) throws ParseException{
		/*
		 * Calendar有一个方法getTime()
		 * 可以获得一个Date ,该Date表示的时间就是当前Calendar所表示的时间
		 */
		Calendar c1=Calendar.getInstance();
		Date d1=c1.getTime();
		System.out.println(d1);
		/*
		 * Date到Calendar
		 * Calendar的setTime方法允许我们传入一个Date对象
		 * 是的当前Calendar描述给定的Date对象所描述的时间
		 */
		Date d2=new Date();
		Calendar c2=Calendar.getInstance();
		c2.setTime(d2);
		System.out.println(c2);
		/*
		 * Calendar--->String
		 * 首先：
		 * Calendar--->date
		 * 然后：
		 * 通过SimpleDateFormat将Date转换成字符串
		 */
		Calendar c3=Calendar.getInstance();
		Date d3=c3.getTime();
		SimpleDateFormat s3=new SimpleDateFormat("yyyy-MM-dd");
		String str3=s3.format(d3);
		System.out.println(str3);
		/*
		 * String -->Calendar
		 * 首先：
		 * 使用SimpleDateFormat先将字符串转换为Date
		 * 然后：
		 * 通过Calendar的setTime将Date转换为Calendar
		 */
		String str4="2008-08-08";
		SimpleDateFormat s4=new SimpleDateFormat("yyyy-MM-dd");
		Date d4=s4.parse(str4);
		Calendar c4=Calendar.getInstance();
		System.out.println(c4);
		c4.setTime(d4);
		System.out.println(c4);
	}

}
//Calendar----操作时间的API
