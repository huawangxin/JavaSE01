package 作业3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 
 * @author wangxin
 *
 */
public class Test01 {
	public static void main(String args[]) throws ParseException{
		/*
		 * 思路：
		 * 1：获取生产日期
		 * 2：获取保质期
		 * 3：用生产日期加上保质期算出过期时间
		 * 4：将过期时间减去14天
		 * 5：看看嘛当周的周三是哪天
		 * 
		 * 步骤：
		 * 1   ：创建Scanner
		 * 2 :获取用户输入的生产日期的字符串
		 * 3   ：获取用户输入的保质期天数
		 * 4   ：将生产日期转换为Date，从而我们需要创建SimpleDateFormat
		 * 5   ：将生产日期转化为Date,
		 *   为了计算时间，需要将Date转化为Calendar
		 * 6   ，将生产日期加上保质期
		 * 7 :再减去14天
		 * 8   ：设置为当周的周三
		 * 9  ：将Calendar转换为Date
		 * 10:将Date通过SimpleDateFormat转换为字符串并输出
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入生产日期（yyyy-MM-dd）：");
		String dateString=scanner.nextLine();
		
		System.out.println("请输入保质期：");
		int days=scanner.nextInt();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(dateString);
		
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		
		calendar.add(calendar.DAY_OF_YEAR,days);
		calendar.add(calendar.DAY_OF_YEAR, -14);
		calendar.add(calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		//将calendar表示的日期转换为date表示的日期
		date=calendar.getTime();
		//对日期格式化
		dateString=sdf.format(date);
		System.out.println("促销日为 ： "+dateString);
	}

}
