package ื๗าต1;

import java.util.HashSet;

public class Test5 {
	private String aa;
	public Test5(String aa){
		this.aa=aa;
	}
	public static void main(String[] args) {
		HashSet<Object> list=new HashSet<Object>();
		Test5 ws1=new Test5("hh");
		Test5 ws2=new Test5("hh");
		String s1=new String("hh");
		String s2=new String("hh");
		list.add(ws1);list.add(ws2);
		list.add(s1);list.add(s2);
		System.out.println(list.size());
	}
}
