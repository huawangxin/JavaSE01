package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ʹ�õ�������������
 * @author Administrator
 */
public class CollectionDemo8 {
	public static void main(String[] args) {
		Collection c=new ArrayList();
//		Collection c=new HashSet();
		c.add("one");
		c.add("***");
		c.add("two");
		c.add("***");
		c.add("three");
		c.add("***");
		c.add("four");
		
		//java.util.Iterator
		/*
		 * ʹ�õ������������ϵĲ���
		 * ������ѭ��
		 * ��ȡɾ           ����ɾ���������Ǳ����
		 */
		Iterator it=c.iterator();
		
		while(it.hasNext()){
			Object o=it.next();
			String str=(String)o;
			if("***".equals(str)){
				/*�ڵ��������в���ͨ�����ϵ�removeɾ��Ԫ��
				*ֻ��ͨ���������ṩ��remova������ɾ���ոյ�next����������Ԫ�أ�
				*��������һ��next()�������ú󣬷����ٴε���remove()
				*/
				//c.remove(str);
				it.remove();
				
			}
			//���ַ������������ַ����������� equals�Ƚ���:
			//����Ӧ��ʹ�ã�������.equals��������
			//������ֿ�ָ���쳣
			System.out.println(str);
//			System.out.println(it.next());

		}
		System.out.println(c);//[one, two, three, four]
		
	}
}
