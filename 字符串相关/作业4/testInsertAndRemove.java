package 作业4;
//---void add(int index,E 
//
//element )将给定的元素插入到
//
//指定位置，原位置及后续元素都
//
//顺序向后移。
//---E remove(int index)
//删除给定位置的元素
//，并将被删除的元素返回。
import java.util.ArrayList;
import java.util.List;

public class testInsertAndRemove {
	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(2,"d");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		
	}
}
