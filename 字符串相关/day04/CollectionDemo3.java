package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 查看集合中是否包含指定的元素
 * @author wangxin
 *
 */
public class CollectionDemo3 {
	public static void main(String args[]){
		Collection c=new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		/*
		 * boolean contain(Object o)
		 * 查看当前集合中是否包含给定的元素o
		 * 标准是看给定的元素是否在集合中有与某个元素equals比较为true，有则表示包含
		 */
		boolean contains=c.contains("hhh");
		System.out.println("集合中是否包含： "+contains);
		
		String str=new String("a");
		contains=c.contains(str);
		System.out.println("集合中是否包含： "+contains);	}
	
		
}
