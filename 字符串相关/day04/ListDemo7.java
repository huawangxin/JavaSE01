package day04;

import java.util.ArrayList;
import java.util.List;

/**
 * 排序集合元素，元素是自定义类型
 * @author wangxin
 *
 */
public class ListDemo7 {
	public static void main(String []args){
		List<Point> list=new ArrayList<Point>();
		list.add(new Point(1,2));
		list.add(new Point(3,4));
		list.add(new Point(5,6));
		
		
		System.out.println(list);
		
		
	}
}
