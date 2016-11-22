package day01;

/**
 * substring用于获取一个字符串的部分内容
 * 
 * @author Administrator
 *
 */
public class SubstringDemo {

	public static void main(String[] args) {
		//            01234567890123
		String url = "www.oracle.com";
		/**
		 * 通常情况下，用两个数字表示范围时
		 * 都是“含头不含尾”的,从0开始
		 */
		String sub =url.substring(4, 10);
		System.out.println(sub);
		/**
		 * 一个参数从指定位置截取到字符串
		 */
		sub=url.substring(4);
		System.out.println(sub);
		
		url="http:/www.tarena.com.cn";
		/*
		 *思路：
		 *获取第一个点，与第二个点的位置
		 *街区中间的字符串即可 
		 */
		int one =url.indexOf(".");
		int two=url.indexOf(".",one+1);
		String s=url.substring(one+1,two);
		System.out.println(s);
	}
}
