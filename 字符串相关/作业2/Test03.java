package 作业2;

import java.util.Scanner;

/**
 * 调入一个数字，分析是否为整数或小数
 * 并转化为相应的数字
 * @author wangxin
 *
 */
public class Test03 {
	public static void main(String[] args) {
		/*
		 * 1：向用户索取一个输入的数字
		 * 2：判断输入的内容是否为小数还是整数
		 * 3：将内容转化为数字
		 * 4：输出
		 * 步骤：
		 * 1：使用Scanner获取用户输入的一行字符串
		 * 2：书写一个正则表达式验证
		 * 3：使用包装类，将字符串转化为基本类型
		 * 4：输出
		 */
		Scanner scanner=new Scanner(System.in);
		String line=scanner.nextLine();
		
		String intRegex="[0-9]+";
		String doubleRegex="[0-9]+\\.[0-9]+";
		
		if(line.matches(intRegex)){
			int i=Integer.parseInt(line);
			System.out.println("是一个整数: "+i);
		}else if(line.matches(doubleRegex)){
			double d=Double.parseDouble(line);
			System.out.println("是一个小数： "+d);
		}else {
			System.out.println("您输入的不是正确的数字格式");
		}
	}
}
