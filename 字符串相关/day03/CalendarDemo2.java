package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Calendar��Date,String֮���ת��
 * ����֮���ת�������
 * @author Administrator
 *
 */
public class CalendarDemo2 {
	public static void main(String []args) throws ParseException{
		/*
		 * Calendar��һ������getTime()
		 * ���Ի��һ��Date ,��Date��ʾ��ʱ����ǵ�ǰCalendar����ʾ��ʱ��
		 */
		Calendar c1=Calendar.getInstance();
		Date d1=c1.getTime();
		System.out.println(d1);
		/*
		 * Date��Calendar
		 * Calendar��setTime�����������Ǵ���һ��Date����
		 * �ǵĵ�ǰCalendar����������Date������������ʱ��
		 */
		Date d2=new Date();
		Calendar c2=Calendar.getInstance();
		c2.setTime(d2);
		System.out.println(c2);
		/*
		 * Calendar--->String
		 * ���ȣ�
		 * Calendar--->date
		 * Ȼ��
		 * ͨ��SimpleDateFormat��Dateת�����ַ���
		 */
		Calendar c3=Calendar.getInstance();
		Date d3=c3.getTime();
		SimpleDateFormat s3=new SimpleDateFormat("yyyy-MM-dd");
		String str3=s3.format(d3);
		System.out.println(str3);
		/*
		 * String -->Calendar
		 * ���ȣ�
		 * ʹ��SimpleDateFormat�Ƚ��ַ���ת��ΪDate
		 * Ȼ��
		 * ͨ��Calendar��setTime��Dateת��ΪCalendar
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
//Calendar----����ʱ���API
