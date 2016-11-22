package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * ��Ԫ�������ṩ�ıȽϹ������������Ƕ������������ʱ�� ���ǿ��Զ�����ṩһ�ֱȽϹ���
 * 
 * @author wangxin
 *
 */
public class ListDemo8 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("������");
		list.add("����");
		list.add("�����");
		list.add("����");
		list.add("��ǹС˧");
		list.add("�°���");
		list.add("����");
		System.out.println(list);
		MyComparator com=new MyComparator();
		/*
		 * ��Ԫ�������ṩ�ıȽϹ�����������������
		 * ���ǿ����ṩ����ıȽϹ���
		 */
//		Collections.sort(list);
		Collections.sort(list,com);

		System.out.println(list);

	}
}

class MyComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		// �ĸ��ַ������ַ������ĸ��ַ�����
		return o1.length() - o2.length();
	}
}