package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ���ϵĳ���
 * @author wangxin
 *
 */
public class CollectionDemo2 {
	public static void main(String args[]){
		Collection c=new ArrayList();
		/*
		 * Collection������һ������
		 * int size()
		 * ���ڻ�ȡ��ǰ�����е�Ԫ������
		 */
		System.out.println(c.size());//0
		/*
		 * boolean isEmpty()
		 * �÷��������жϵ�ǰ�������Ƿ񲻺����κ�Ԫ��
		 * ע�ⲻ���жϼ����Ƿ�Ϊ��null
		 */
		System.out.println(c.isEmpty());//true
		
		c.add("a");
		c.add("b");
		c.add("c");
		System.out.println(c.size());//3
		System.out.println(c.isEmpty());//false
		/*
		 * void clean
		 * �÷���������ռ���Ԫ��
		 */
		c.clear();
		System.out.println(c.size());//0
		System.out.println(c.isEmpty());//true
		
		
		
		
	}
}
