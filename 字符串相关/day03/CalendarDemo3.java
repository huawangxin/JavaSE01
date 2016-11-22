package day03;

import java.util.Calendar;
import java.util.Date;

/**
 * Calendar�ṩ��һ��set����
 * ���Զ�ĳһ��ʱ��������ø�����ֵ
 * ʱ�����ʹ��Calendar�ṩ�����ɳ���
 * @author wangxin
 *
 */
public class CalendarDemo3 {
	public static void main(String args[]){
		Calendar calendar=Calendar.getInstance();
		/*
		 * 2008-08-08 20:22:35
		 * �����õ�ʱ�䵥λ��Ӧ��ֵ��Ӱ��û�б����õ�ֵ��
		 * ��ô��ֵҲ���Ӧ�ı�ľͺñȣ�
		 * ���������������գ���ô��Ӧ���ܼ�Ҳ����Ÿı䡣
		 */
		calendar.set(Calendar.YEAR, 2014);
		calendar.set(Calendar.MONTH,10);
		/*
		 * ���Ǵ�0��ʼ�ģ�0Ϊ1��
		 * DAY_OF_MONTH  ͨ��˵�ġ��š�
		 * DAY_OF_YEAR   ͨ��˵�ĵڼ���
		 * DAY_OF_WEER   ͨ��˵�����ڼ�
		 */
//		calendar.set(Calendar.AM_PM, 22);
//		calendar.set(Calendar.HOUR, 8);
		calendar.set(Calendar.DAY_OF_MONTH,25);
		calendar.set(Calendar.HOUR_OF_DAY, 11);
		/*
		 * �����õĵ�λ��Ӧ��ֵ�����˸õ�λ��������ֵʱ��
		 * Calendar���Զ���λ
		 * ����Сʱ�������λ
		 * ��������Ҳ��Ӱ������
		 * 
		 */
		calendar.set(Calendar.MINUTE, 11);
		calendar.set(Calendar.SECOND, 11);
		
		
		//1��ʾ���� ��2��ʾ��һ
		calendar.set(Calendar.DAY_OF_WEEK, 1);
		
		Date date=calendar.getTime();
		System.out.println(date);

	}
}
