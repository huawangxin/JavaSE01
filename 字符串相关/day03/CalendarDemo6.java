package day03;

import java.util.Calendar;

/**
 * ��ȡĳһʱ����������ֵ
 * �����ֵ�ǹ̶��ģ�ͨ�����ǲ�����ø÷���
 * @author wangxin
 *
 */
public class CalendarDemo6 {
	public static void main(String []args){
		Calendar calendar=Calendar.getInstance();
		//�����ܹ�������
		int days=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("�����ܹ� "+days+"��");
		days=calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("�µ���"+days);
	}

}
