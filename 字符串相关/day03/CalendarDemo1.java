package day03;

import java.util.Calendar;

/**
 * Calendar���ڲ���ʱ��API
 * ͨ������ʹ�ø������������������
 * @author wangxin
 *
 */
public class CalendarDemo1 {
	public static void main(String args[]){
		/*
		 * Calendar�ڲ���ʾһ��ʱ��
		 * Ĭ�ϴ���������Calendar��ʾ��ǰϵͳʱ��
		 */
		Calendar calendar=Calendar.getInstance();
		/*
		 * Calendar��toString�ǲ��ɶ���
		 */
		System.out.println(calendar.getClass().getName());
	}

}
