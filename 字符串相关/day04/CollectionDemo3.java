package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * �鿴�������Ƿ����ָ����Ԫ��
 * @author wangxin
 *
 */
public class CollectionDemo3 {
	public static void main(String args[]){
		Collection c=new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		/*
		 * boolean contain(Object o)
		 * �鿴��ǰ�������Ƿ����������Ԫ��o
		 * ��׼�ǿ�������Ԫ���Ƿ��ڼ���������ĳ��Ԫ��equals�Ƚ�Ϊtrue�������ʾ����
		 */
		boolean contains=c.contains("hhh");
		System.out.println("�������Ƿ������ "+contains);
		
		String str=new String("a");
		contains=c.contains(str);
		System.out.println("�������Ƿ������ "+contains);	}
	
		
}
