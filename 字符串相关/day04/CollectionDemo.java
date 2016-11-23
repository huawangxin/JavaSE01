package day04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合可以保存一组数据，功能上比数组强
 * 集合中存放引用类型元素
 * 集合中存放的是元素的地址，而非元素对象本身
 * @author wangxin
 *
 */
public class CollectionDemo {
	
	public static void main(String[] args){
		//java.util.Collection
		Collection c=new  ArrayList();
		/*
		 * boolean add(E e)
		 * 该方法用于向集合中添加给定元素
		 * 返回值：true 表示添加给成功
		 *      false表示添加失败
		 */
		Element e1=new Element();
		e1.setRow(1);
		e1.setCol(2);
		Element e2=new Element();
		e2.setRow(3);
		e2.setCol(4);
		/*
		 * 这里实际存入的是e1这个引用变量的值
		 * 也就是将地址存入了集合
		 */
		c.add(e1);
		c.add(e2);
		//输出集合
		/*
		 * 集合toString的格式
		 * [元素1.toString(),元素2.toString()]
		 * 集合有上限，但是用不到那么大
		 */
		System.out.println(c);
		
		e1.setRow(5);
		e1.setCol(6);
		System.out.println(e1);
		System.out.println(c);
	}
}
