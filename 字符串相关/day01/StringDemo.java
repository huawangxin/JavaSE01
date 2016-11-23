package day01;
/**
 * 字符串不变对象的测试
 * @author Administrator
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		//字面量，直接量
		//java把字符串优化了
		String a="ss";
		String str="sssss";
		String str2="sssss";
		String str3="sssss";
		String str4="ss"+"sss";
		String str5=a+"sss";
//		str+="!";
//		System.out.println(str2);
		System.out.println(str==str2);//双等于就是引用地址一样
		System.out.println(str==str3);
		System.out.println(str==str4);
		System.out.println(str==str5);
		System.out.println(a);
		/**
		 * java在编译的时候做了一个优化，
		 * 若进行计算两边的内容都是字面量时，将结果计算，所以在字节码文件中，生成出：
		 * String str4="helloworld";
		 */
		String s1="abc123";
		String s2="abc"+123;
//		String s3=1+"2"+3+"abc";
		String s3="abc"+1+"2"+3;
		String s4=1+2+"3"+"abc";
//		String s5='1'+2+"3"+"abc";
		String s5="abc"+'1'+2+"3";
		String s6="1"+'2'+3+"abc";
		//true
		System.out.println(s1==s2);
		//true
		System.out.println(s1==s3);
		//false
		System.out.println(s1==s4);
		//true
		System.out.println(s1==s5);
		//false
		System.out.println(s1==s6);
	}
}
