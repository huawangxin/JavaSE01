package day01;

import java.util.Scanner;

/**
 * 将字符串中英文部分转换为大小写
 * @author Administrator
 *
 */
public class UpperCaseAndLowerCaseDemo {
	public static void main(String args[]){
		String str="我爱Java";
		/**
		 * 将字符串中的英文部分转化为全大写
		 */
		String upper=str.toUpperCase();
		String lower=str.toLowerCase();
		System.out.println(upper);
		System.out.println(lower);
		
		String message="Ef36JbzS";
		System.out.println("请输入验证码"+message);
		
		Scanner scanner=new Scanner(System.in);
		String str1=scanner.nextLine();
		//将验证码转换为全小写
		message=message.toLowerCase();
		//将用户输入的验证码转化为全小写
		str1=str1.toLowerCase();
		if(message.equals(str1)){
			System.out.println("输入正确");
		}else {
			System.out.println("输入错误");
		}
	}

}
