package day03;

import java.util.Date;

/**
 * java.util.Date
 * 其内部维护一个long值
 * 保存从1970年元旦到这一刻的毫秒值
 * @author wangxin
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		//创建出来的实例表示当前系统时间
		Date date=new Date();
		//2014-08-21 10:33:22  
		System.out.println(date);
		long time=date.getTime();
		time+=1000*60*60*24;
		System.out.println(time);
		
		date.setTime(time);
		System.out.println(date);
		
	}

}
