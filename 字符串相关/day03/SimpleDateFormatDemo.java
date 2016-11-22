package day03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * SimpleDateFormat
 * 可以根据一个特定的日期格式字符串，
 * 将字符串与Date之间互相转换
 * @author wangxin
 *通过一个日期格式 在date和日期格式之间互相转换
 */
public class SimpleDateFormatDemo {
	public static void main(String args[]){
		Date now=new Date();
		System.out.println(now);
		//2014-08-21  11:07:22
		//yyyy-MM-dd  HH:mm:ss
		String format="日期：yyyy-MM-dd  时间：HH:mm:ss";
		SimpleDateFormat sdf
		=new SimpleDateFormat(format);
		String str=sdf.format(now);
		System.out.println(str);
	}
}
//构造器是什么 做成PPT