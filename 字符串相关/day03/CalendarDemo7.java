package day03;

import java.util.Calendar;

/**
 * ʹ��add������Calendar��ʾ��ʱ����м���
 * @author wangxin
 *
 */
public class CalendarDemo7 {
	public static void main(String args[]){
		Calendar calendar=Calendar.getInstance();
		//��3��
		calendar.add(Calendar.YEAR, 3);
		//��2��
		calendar.add(Calendar.MONTH, 2);
		//��30��,����ļӼ�ֻ��DAY_OF_YEAR
		calendar.add(Calendar.DAY_OF_YEAR, -30);
		
		System.out.println(calendar.getTime());
		
	}
}
