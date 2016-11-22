package ื๗าต1;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
	public static void append(List list){
		list.add("0042");
	}
	public static void main(String[] args) {
		List<Integer> inList=new ArrayList<Integer>();
		append(inList);
		System.out.println(inList.get(0));
	}
}
