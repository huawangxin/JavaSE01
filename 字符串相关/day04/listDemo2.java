package day04;

import java.util.ArrayList;
import java.util.List;
/**
 * list���з���2
 * void add(int index,E e)
 * E remove(int index)
 * @author wangxin
 *
 */
public class listDemo2 {
	public static void main(String []args){
		List<String>  list=new ArrayList<String>();
		//Collection�е�add.�򼯺���׷����Ԫ��
		list.add("one");
		list.add("two");
		list.add("three");
		//list ��add������ͨ���ǲ�����Ԫ��
		list.add(1,"2");
		System.out.println(list);
		//����ͨ��remove��ȡ��ɾԪ��
		String str=list.remove(2);
		System.out.println(list);
		System.out.println("��ɾ����Ԫ����  ��"+str);
		
		
	}
}
