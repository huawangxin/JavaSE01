package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

import day01.ValueOfDemo;

/*
 * ��һ��Ԫ���е�����Ԫ����ӵ���һ��Ԫ����
 */
public class CollectionDemo7 {
	public static void main(String []args){
//		Collection c1=new ArrayList();
//		Collection c2=new ArrayList();
		Collection c1=new HashSet();
		Collection c2=new HashSet();
		
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		c2.add("d");
		c2.add("e");
		c2.add("f");
		/*
		 * boolean addAll(Collection c)
		 * ����������������Ԫ�ش��뵱ǰ����
		 * ����ǰ������Ϊ�÷������������ı�
		 * �򷵻�true
		 */
		c1.addAll(c2);
		System.out.println(c1);
		
		Collection c3=new ArrayList();
		c3.add("d");
		c3.add("e");
		c3.add("f");
		/*
		 * boolean containAll(Collection c)
		 * �鿴��ǰ�������Ƿ�����������ϵ�����Ԫ��
		 */
		boolean con=c1.containsAll(c3);
		System.out.println(con);
		
		
		
		Collection c4=new ArrayList();
		c4.add("a");
		c4.add(new Date());
		c4.add(1);//c4.add(in1);
		
	}
}
