package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 泛类  java5之后退出的一个新特性 
 * 在集合中的应用是作用约束集合元素的
 * 泛型只能是引用类型
 * @author wangxin
 *
 */
public class TypeDemo {
	public static void main(String[] args){
		Collection<String> c=new ArrayList<String>();
		
		c.add("one");
		c.add("two");
		c.add("three");
		
//		Collection<Integer> c2=new ArrayList<Integer>();
//		c2.add(1);
		
		for(String str:c){
			System.out.println(str);
		}
		
	}
}
