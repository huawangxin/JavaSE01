package day03;

import java.util.Date;

/**
 * java.util.Date
 * ���ڲ�ά��һ��longֵ
 * �����1970��Ԫ������һ�̵ĺ���ֵ
 * @author wangxin
 *
 */
public class DateDemo {
	public static void main(String[] args) {
		//����������ʵ����ʾ��ǰϵͳʱ��
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
