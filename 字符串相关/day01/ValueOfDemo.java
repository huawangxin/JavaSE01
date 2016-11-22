package day01;
/**
 * 将其他数据类型转换为字符串类型
 * @author Administrator
 *
 */
public class ValueOfDemo {
	public static void main(String args[]){
		double pi=3.1415926;
		//将double值转化为字符串形式
		String piString=String.valueOf(pi);
		System.out.println(piString);
		//将int值转化为字符串形式
		String intStr =String.valueOf(1);
		System.out.println(intStr);

		//将boolean值转换为字符串形式
		String booleaStr =String.valueOf(false);
		System.out.println(booleaStr);

	}

}
