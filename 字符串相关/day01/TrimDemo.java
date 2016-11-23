package day01;
/**
 * trim()方法，用于去除字符串前导和后继的“空白”
 * @author Administrator
 */
public class TrimDemo {

	public static void main(String[] args) {
		String str ="  hello world	";
		String trim= str.trim();
		System.out.println(str);
		System.out.println(trim);
	}
}
