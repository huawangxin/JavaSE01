package ��ҵ3;

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
		 * ˼·��
		 * 1����ȡ��������
		 * 2����ȡ������
		 * 3�����������ڼ��ϱ������������ʱ��
		 * 4��������ʱ���ȥ14��
		 * 5�������ﵱ�ܵ�����������
		 * 
		 * ���裺
		 * 1   ������Scanner
		 * 2 :��ȡ�û�������������ڵ��ַ���
		 * 3   ����ȡ�û�����ı���������
		 * 4   ������������ת��ΪDate���Ӷ�������Ҫ����SimpleDateFormat
		 * 5   ������������ת��ΪDate,
		 *   Ϊ�˼���ʱ�䣬��Ҫ��Dateת��ΪCalendar
		 * 6   �����������ڼ��ϱ�����
		 * 7 :�ټ�ȥ14��
		 * 8   ������Ϊ���ܵ�����
		 * 9  ����Calendarת��ΪDate
		 * 10:��Dateͨ��SimpleDateFormatת��Ϊ�ַ��������
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("�������������ڣ�yyyy-MM-dd����");
		String dateString=scanner.nextLine();
		
		System.out.println("�����뱣���ڣ�");
		int days=scanner.nextInt();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date=sdf.parse(dateString);
		
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(date);
		
		calendar.add(calendar.DAY_OF_YEAR,days);
		calendar.add(calendar.DAY_OF_YEAR, -14);
		calendar.add(calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
		//��calendar��ʾ������ת��Ϊdate��ʾ������
		date=calendar.getTime();
		//�����ڸ�ʽ��
		dateString=sdf.format(date);
		System.out.println("������Ϊ �� "+dateString);
	}

}
