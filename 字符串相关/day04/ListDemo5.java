package day04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ����ת����List����
 * @author wangxin
 *
 */
public class ListDemo5 {
	public static void main(String[] args) {
		String[] array={"a","b","c","d"};
		/*
		 * ����ֻ��ת��ΪList����
		 * ��Ϊ��ת��ΪSet���ܻᶪʧ�ظ�Ԫ��
		 */
		List<String> list=Arrays.asList(array);
		System.out.println(list);
		/*
		 * ͨ������ת���ļ��ϣ��ǲ��ܸı伯��Ԫ��������
		 * �޸ļ���Ԫ�����ݣ���Ӱ��ԭ����
		 */
//		list.add("e");
//		list.remove(3);
		list.set(3, "e");
		
		System.out.println(list);
		System.out.println(Arrays.toString(array));
		/*
		 * ���еļ���ʵ���඼֧��һ�����췽��
		 * �÷������Դ���һ��Collection��
		 * ��ô�ù��췽�����������ļ���Ĭ�Ͼ�����˸��������е�����Ԫ��
		 * �����Ĺ��췽���������ƹ�����
		 */
		List list2=new ArrayList(list);
		System.out.println(list2);
		list2.add("f");
		System.out.println(list2);
		
		
		
	}
}
