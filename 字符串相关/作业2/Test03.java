package ��ҵ2;

import java.util.Scanner;

/**
 * ����һ�����֣������Ƿ�Ϊ������С��
 * ��ת��Ϊ��Ӧ������
 * @author wangxin
 *
 */
public class Test03 {
	public static void main(String[] args) {
		/*
		 * 1�����û���ȡһ�����������
		 * 2���ж�����������Ƿ�ΪС����������
		 * 3��������ת��Ϊ����
		 * 4�����
		 * ���裺
		 * 1��ʹ��Scanner��ȡ�û������һ���ַ���
		 * 2����дһ��������ʽ��֤
		 * 3��ʹ�ð�װ�࣬���ַ���ת��Ϊ��������
		 * 4�����
		 */
		Scanner scanner=new Scanner(System.in);
		String line=scanner.nextLine();
		
		String intRegex="[0-9]+";
		String doubleRegex="[0-9]+\\.[0-9]+";
		
		if(line.matches(intRegex)){
			int i=Integer.parseInt(line);
			System.out.println("��һ������: "+i);
		}else if(line.matches(doubleRegex)){
			double d=Double.parseDouble(line);
			System.out.println("��һ��С���� "+d);
		}else {
			System.out.println("������Ĳ�����ȷ�����ָ�ʽ");
		}
	}
}
