package day04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/**
 * 新循环 用来遍历集合或数组
 * @author wangxin
 */
public class NewForDemo {
	public static void main(String []args){
		String[] array={"a","b","c","d","e"};
		for (int i = 0; i < array.length; i++) {
			String str=array[i];
			System.out.println("第"+i+"个元素是："+str);
		}
		//新循环遍历数组
		//新循环不关心循环次数
		for(String str:array){
			System.out.println(str);
		}
		Collection collection=new ArrayList();
		collection.add("one");
		collection.add("two");
		collection.add("three");
		collection.add("four");
		
		Iterator it=collection.iterator();
		while(it.hasNext()){
			String str=(String)it.next();
			System.out.println(str);
		}
		
		for(Object str:collection){
			System.out.println(str);
		}
		
	}
}
