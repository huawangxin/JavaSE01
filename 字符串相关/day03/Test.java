package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 编写一个程序
 * 用户输入自己的生日，格式：yyyy-MM-dd
 * 然后提示用户到今天为止已经活了多少天
 * @author wangxin
 *
 */
public class Test {
	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String ars[]) throws ParseException{
		/*
		 *1:用户输入一个生日的字符串
		 *2：将字符串转换为Date
		 *3：创建一个Date表示今天的时间
		 *4：今天的毫秒减去生日的毫秒，计算出活了多少毫秒
		 *5：将毫秒转换为天
		 *6：输出
		 * 
		 */
		//1
		System.out.println("请输入您的生日：yyyy-MM-dd");
		Scanner scaner=new Scanner(System.in);
		String birStr=scaner.nextLine();
		String regex="\\d{4}-\\d{2}-\\d{2}";
			if(birStr.matches(regex)){
				//将用户输入的生日转换成Date
				String format="yyyy-MM-dd";
				SimpleDateFormat sdf=new SimpleDateFormat(format);
				Date birthday=sdf.parse(birStr);
				Date now=new Date();
				long sum=now.getTime()-birthday.getTime();
				long days=sum/1000/60/60/24;
//				long sum1=now.getYear()-birthday.getYear();
				
				System.out.println("恭喜您活了 "+days+"天！     继续加油");
//				System.out.println("恭喜您活了 "+sum1+"年！     继续加油");

			}else {
				System.out.println("输入的生日格式不对！");
				
			}
		
		
		
	}

}
