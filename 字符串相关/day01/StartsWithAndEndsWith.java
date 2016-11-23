package day01;
/**
 * 检查一个字符串是否是以给定的字符串开始的或结尾的
 * @author Administrator
 *
 */
public class StartsWithAndEndsWith {
	public static void main(String args[]){
		String str="Thinking in Java";
		boolean start=str.startsWith("T");
		boolean end=str.endsWith("Java");
		System.out.println("是否以T开头："+start);
		System.out.println("是否以Java结尾："+end);
	}
}
