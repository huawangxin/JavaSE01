package day03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ��дһ������
 * �û������Լ������գ���ʽ��yyyy-MM-dd
 * Ȼ����ʾ�û�������Ϊֹ�Ѿ����˶�����
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
		 *1:�û�����һ�����յ��ַ���
		 *2�����ַ���ת��ΪDate
		 *3������һ��Date��ʾ�����ʱ��
		 *4������ĺ����ȥ���յĺ��룬��������˶��ٺ���
		 *5��������ת��Ϊ��
		 *6�����
		 * 
		 */
		//1
		System.out.println("�������������գ�yyyy-MM-dd");
		Scanner scaner=new Scanner(System.in);
		String birStr=scaner.nextLine();
		String regex="\\d{4}-\\d{2}-\\d{2}";
			if(birStr.matches(regex)){
				//���û����������ת����Date
				String format="yyyy-MM-dd";
				SimpleDateFormat sdf=new SimpleDateFormat(format);
				Date birthday=sdf.parse(birStr);
				Date now=new Date();
				long sum=now.getTime()-birthday.getTime();
				long days=sum/1000/60/60/24;
//				long sum1=now.getYear()-birthday.getYear();
				
				System.out.println("��ϲ������ "+days+"�죡     ��������");
//				System.out.println("��ϲ������ "+sum1+"�꣡     ��������");

			}else {
				System.out.println("��������ո�ʽ���ԣ�");
				
			}
		
		
		
	}

}
