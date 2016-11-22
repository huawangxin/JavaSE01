package day04;

import java.util.ArrayList;
import java.util.List;
/**
 * list独有方法2
 * void add(int index,E e)
 * E remove(int index)
 * @author wangxin
 *
 */
public class listDemo2 {
	public static void main(String []args){
		List<String>  list=new ArrayList<String>();
		//Collection中的add.向集合中追加新元素
		list.add("one");
		list.add("two");
		list.add("three");
		//list 的add方法，通常是插入新元素
		list.add(1,"2");
		System.out.println(list);
		//可以通过remove获取被删元素
		String str=list.remove(2);
		System.out.println(list);
		System.out.println("被删除的元素是  ："+str);
		
		
	}
}
