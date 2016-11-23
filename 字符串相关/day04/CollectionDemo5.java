package day04;

import java.util.ArrayList;
import java.util.Collection;



/**
 * 从集合中删除元素
 * @author wangxin
 */
public class CollectionDemo5 {
	public static void main(String args[]){
		Collection c=new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		System.out.println(c);//[a,b,c]
		/*
		 * boolean remove(Oject o)
		 * 从集合中删除给定的元素
		 */
		c.remove("b");
		System.out.print(c);//[a,c]
		
	}
}
