package ��ҵ4;
//---void add(int index,E 
//
//element )��������Ԫ�ز��뵽
//
//ָ��λ�ã�ԭλ�ü�����Ԫ�ض�
//
//˳������ơ�
//---E remove(int index)
//ɾ������λ�õ�Ԫ��
//��������ɾ����Ԫ�ط��ء�
import java.util.ArrayList;
import java.util.List;

public class testInsertAndRemove {
	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(2,"d");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
	}
}
