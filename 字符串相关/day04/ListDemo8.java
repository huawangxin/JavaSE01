package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 当元素自身提供的比较规则不能满足我们对于排序的需求时， 我们可以额外的提供一种比较规则。
 * 
 * @author wangxin
 *
 */
public class ListDemo8 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("范传奇");
		list.add("马云");
		list.add("李宏毅");
		list.add("巴神");
		list.add("金枪小帅");
		list.add("奥巴马");
		list.add("赵云");
		System.out.println(list);
		MyComparator com=new MyComparator();
		/*
		 * 但元素自身提供的比较规则不能满足排序条件
		 * 我们可以提供额外的比较规则
		 */
//		Collections.sort(list);
		Collections.sort(list,com);

		System.out.println(list);

	}
}

class MyComparator implements Comparator<String> {
	@Override
	public int compare(String o1, String o2) {
		// 哪个字符串的字符串多哪个字符串大
		return o1.length() - o2.length();
	}
}