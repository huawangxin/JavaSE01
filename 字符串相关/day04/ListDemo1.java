package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * Lise 可重复且有序
 * 特点：可以根据下标操作元素，这一点和数组很像
 * @author wangxin
 *
 */
public class ListDemo1 {
	public static void main(String[] args) {
		//java.util.List
		List<String> list=new ArrayList<String>();
//		List<String> list=new LinkedList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		
		for(int i=0;i<list.size();i++){
			String str=list.get(i);
			System.out.println(str);
		}
		/*
		 * E set(int index,E e)
		 * 将给定的元素设置到指定位置上
		 * 返回值为原位置被替换的元素
		 */
		String str=list.set(1, "2");
		System.out.println("被替换的元素： "+str);
		System.out.println(list);
		/*
		 * set的作用不是添加新元素，而是替换操作
		 * 所以下标不能超过集合要求的范围
		 */
//		list.set(3, "4");
		
	}
}
