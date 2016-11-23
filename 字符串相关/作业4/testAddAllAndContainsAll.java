package ื๗าต4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class testAddAllAndContainsAll {
	public static void main(String[] args) {
		Collection<String> c1=new ArrayList<String>();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		System.out.println(c1);
		Collection<String> c2=new HashSet<String>();
		c2.addAll(c1);
		System.out.println(c2);
		Collection<String> c3=new ArrayList<String>();
		c3.add("c");
		System.out.println(c1.contains(c3));
	}
}
