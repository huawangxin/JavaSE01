package day01;
/**
 * 字符串的indexOf方法，用于查找字符串的位置
 * @author Administrator
 *
 */
public class IndexDemo {
	public static void main(String[] args) {
		String str="thinking in java";
		int index=str.indexOf("java");
		System.out.println(index);
		/**
		 * 从指定位置开始查找第一次出现给定字符串的位置
		 */
		index=str.indexOf("in",9);
		System.out.println(index);
		/**
		 * 从指定位置开始查找最后一次出现给定字符串的位置
		 */
		index=str.lastIndexOf("in");
		System.out.println(index);
	}
}
