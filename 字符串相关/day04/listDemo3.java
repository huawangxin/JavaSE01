package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 获取子集 subList
 * @author wangxin
 *
 */
public class listDemo3 {
	public static void main(String []args){
		List<Integer> list=new ArrayList<Integer>();
		
		//[0,1,2,3,4,5,6,7,8,9]
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		/*
		 * subList(int from,int to)
		 * 获取给定范围的子集，注意同样是含头不含尾
		 */
		
		List<Integer> subList=list.subList(3, 8);
		System.out.println(list);
		System.out.println(subList);
		//对元素中的每一个元素扩大10倍
		for (int i = 0; i < subList.size(); i++) {
			int num=subList.get(i);
			num=num*10;
			subList.set(i, num);
			
		}
		/*
		 * 当我们通过子集修改元素，会影响原集合
		 */
		System.out.println(subList);
		System.out.println(list);
		
	}
}
