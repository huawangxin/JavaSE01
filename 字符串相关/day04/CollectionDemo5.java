package day04;

import java.util.ArrayList;
import java.util.Collection;



/**
 * �Ӽ�����ɾ��Ԫ��
 * @author wangxin
 */
public class CollectionDemo5 {
	public static void main(String args[]){
		Collection c=new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		System.out.println(c);//[a,b,c]
		/*
		 * boolean remove(Oject o)
		 * �Ӽ�����ɾ��������Ԫ��
		 */
		c.remove("b");
		System.out.print(c);//[a,c]
		
	}
}
