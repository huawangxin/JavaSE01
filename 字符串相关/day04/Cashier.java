package day04;

import java.util.Scanner;

/**
 * ������Ʒ���ۡ����������Լ��տ��������
 * @author wangxin
 *
 */
public class Cashier {
	public static void main(String[] args) {
		//��������
		Scanner console=new Scanner(System.in);
		System.out.println("�����뵥�ۣ�������");
		double unitPrice=console.nextDouble();
		System.out.println("������������");
		double amount=console.nextDouble();
		System.out.println("�������������");
		double money=console.nextDouble();
		console.close();
		//������Ʒ�ܼ�
		double totalPrice=0.0;
		totalPrice=unitPrice*amount;
		//��������
		double change=money-totalPrice;
		System.out.println("Ӧ�ս��Ϊ���� "+totalPrice+",����Ϊ�� ��"+change);
		
	}
}
