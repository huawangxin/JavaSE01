package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Collections�����ϵĹ����ࣩ  ��Collection(���ϵĸ��ӿڣ�  
/**
 * List���ϵ�����
 * ��set��������ͨ�����������
 * @author wangxin
 *
 */
public class ListDemo6 {
	public static void main(String[] args){
		List<Integer> list=new ArrayList<Integer>();
		/*
		 * ����10����������뼯��
		 */
		Random random=new Random();
		for(int i=0;i<10;i++){
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		/*
		 * Collection.sort����
		 * ��Լ�����Ȼ������С����
		 */
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
	}
}
