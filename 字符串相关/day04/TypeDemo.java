package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ����  java5֮���˳���һ�������� 
 * �ڼ����е�Ӧ��������Լ������Ԫ�ص�
 * ����ֻ������������
 * @author wangxin
 *
 */
public class TypeDemo {
	public static void main(String[] args){
		Collection<String> c=new ArrayList<String>();
		
		c.add("one");
		c.add("two");
		c.add("three");
		
//		Collection<Integer> c2=new ArrayList<Integer>();
//		c2.add(1);
		
		for(String str:c){
			System.out.println(str);
		}
		
	}
}
