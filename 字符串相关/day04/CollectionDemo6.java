package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * �Ӽ�����ɾ��ָ����Ԫ��֮2
 * @author Administrator
 *
 */
public class CollectionDemo6 {
	public static void main(String []args){
		Collection c=new ArrayList();
		Element e1=new Element();
		e1.setRow(1);
		e1.setCol(1);
		
		Element e2=new Element();
		e2.setRow(1);
		e2.setCol(1);
		
		Element e3=new Element();
		e3.setRow(1);
		e3.setCol(1);
		
		c.add(e1);
		c.add(e2);
		System.out.println(c);
		/*
		 * remove������ʹ�ø���Ԫ���뼯����ÿһ��Ԫ��˳��Ƚ�equals�Ľ��
		 * ��ɾ������һ����������Ǹ�Ԫ��equals�ȽϽ��Ϊtrue��
		 */
		c.remove(e3);
		System.out.println(c);
		
		
	}
}
