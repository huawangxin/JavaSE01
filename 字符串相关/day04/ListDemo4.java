package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * Listת������
 * @author wangxin
 *
 */
public class ListDemo4 {
	public static void main(String []ags){
		/*
		 * ����list,setҲ�ǿ���ת�������
		 * ֻ�ǲ�����
		 */
		List<String> list=new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		/*
		 * toArray��������Collection�ж���� ����set����Ҳ����ת��Ϊ����
		 */
		Object[] array=list.toArray();
		for(Object o:array){
			String str=(String)o;
			System.out.println(str);
		}
		//��������toArrayʵ�ʿ����бȽϳ���
		String[] strArray=list.toArray(new String[list.size()]);
		for(String str:strArray){
			System.out.println(str);
		}
		
		
	}
}
