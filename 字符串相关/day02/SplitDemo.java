package day02;

import java.util.Arrays;

/**
 * split�������ڲ���ַ���
 * ���ַ���������������ʽ�Ĳ��֡��г�����
 * ����ʣ�µĲ���
 * @author Administrator
 *
 */
public class SplitDemo {
	public static void main(String args[]){
		String str="121sdfasdgfa3423kh53k52k2h1k4h";
		/*
		 * ����ÿһ����ĸ���֣��������ֲ��
		 * array��java�д��������Ψһ��
		 */
		String[] array=str.split("[0-9]+");
//		String[] array1=str.split("[0-9]");
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
//		System.out.println(Arrays.toString(array1));
	}

}
