package day04;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Deque��˫�˶��У����е����˾�������������
 * ���������Ƴ���ֻ�ܴӶ��е�һ�γ��������
 * ���γ��˾�������ݽṹ��ջ��
 * ջ�洢Ԫ����ѭ�Ƚ��ȳ�ԭ��
 * ��FILO First Input last output��
 * @author wangxin
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> stack=new LinkedList<String>();
		//��ջ���� push
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		//���á�������ջ
//		System.out.println(stack);
//		String str=stack.peek();
//		System.out.println(str);
//		System.out.println(stack);
		
		while(stack.size()>0){
			String str1=stack.pop();
			
			System.out.println(str1);
		}
		System.out.println(stack);
		/*
		 * ջ��ʵ��Ӧ����ͨ����������ʵ����һ��ϵ�е�
		 * �����п�����
		 * ����ʹ��ջ��ɡ�ǰ�����������ˡ�
		 */
		
		
		
	}
}
