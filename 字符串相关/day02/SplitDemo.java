package day02;

import java.util.Arrays;

/**
 * split方法用于拆分字符串
 * 将字符串中满足正则表达式的部分“切除”；
 * 保留剩下的部分
 * @author Administrator
 *
 */
public class SplitDemo {
	public static void main(String args[]){
		String str="121sdfasdgfa3423kh53k52k2h1k4h";
		/*
		 * 保留每一段字母部分，按照数字拆分
		 * array是java中创建数组的唯一类
		 */
		String[] array=str.split("[0-9]+");
//		String[] array1=str.split("[0-9]");
		System.out.println(array.length);
		System.out.println(Arrays.toString(array));
//		System.out.println(Arrays.toString(array1));
	}

}
