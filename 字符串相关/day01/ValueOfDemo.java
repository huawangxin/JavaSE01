package day01;
/**
 * ��������������ת��Ϊ�ַ�������
 * @author Administrator
 *
 */
public class ValueOfDemo {
	public static void main(String args[]){
		double pi=3.1415926;
		//��doubleֵת��Ϊ�ַ�����ʽ
		String piString=String.valueOf(pi);
		System.out.println(piString);
		//��intֵת��Ϊ�ַ�����ʽ
		String intStr =String.valueOf(1);
		System.out.println(intStr);

		//��booleanֵת��Ϊ�ַ�����ʽ
		String booleaStr =String.valueOf(false);
		System.out.println(booleaStr);

	}

}
