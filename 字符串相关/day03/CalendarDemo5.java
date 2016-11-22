package day03;

import java.util.Calendar;

/**
 * Calendar��get����
 * ���Ի�ȡ��ǰʱ��Calendar����ʾ��ʱ���е�ĳһ��ʱ�䵥λ��ֵ
 * @author wangxin
 *
 */
public class CalendarDemo5 {
	public static void main(String []args){
		Calendar calendar=Calendar.getInstance();
		//��ȡ����һ��
		int year=calendar.get(Calendar.YEAR);
		int mouth=calendar.get(Calendar.MONTH)+1;
		/*
		 * DAY_OF_MONTH
		 * DATE ��DAY_OF_MONTH����һ��
		 */
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		int hour=calendar.get(Calendar.HOUR);
		int minute=calendar.get(Calendar.MINUTE);
		int second=calendar.get(Calendar.SECOND);
		int week=calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println("��"+(week==1?7:week-1));
		System.out.println(year+"-"+mouth+"-"+day);
		System.out.println(hour+":"+minute+":"+second);
	}
}
