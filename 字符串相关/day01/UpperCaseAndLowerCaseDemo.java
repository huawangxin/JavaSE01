package day01;

import java.util.Scanner;

/**
 * ���ַ�����Ӣ�Ĳ���ת��Ϊ��Сд
 * @author Administrator
 *
 */
public class UpperCaseAndLowerCaseDemo {
	public static void main(String args[]){
		String str="�Ұ�Java";
		/**
		 * ���ַ����е�Ӣ�Ĳ���ת��Ϊȫ��д
		 */
		String upper=str.toUpperCase();
		String lower=str.toLowerCase();
		System.out.println(upper);
		System.out.println(lower);
		
		String message="Ef36JbzS";
		System.out.println("��������֤��"+message);
		
		Scanner scanner=new Scanner(System.in);
		String str1=scanner.nextLine();
		//����֤��ת��ΪȫСд
		message=message.toLowerCase();
		//���û��������֤��ת��ΪȫСд
		str1=str1.toLowerCase();
		if(message.equals(str1)){
			System.out.println("������ȷ");
		}else {
			System.out.println("�������");
		}
	}

}
