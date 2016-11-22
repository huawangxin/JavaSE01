package day02;

/**
 * replaceAll方法用于将当前字符串中满足正则表达式的部分替换为给定的字符串
 * @author wangxin
 *
 */
public class ReplaceAll {
	public static void main(String args[]){
		/*
		 * 将str中所有数字替代为“#number#”
		 */
		String str="sdas4434h4j4j4j4j4j4j";
		String replace=str.replaceAll("[0-9]+", "#number#");
		System.out.println(replace);
		
//		String str5="abc2332ddd444nn4mm4";
//		str5=str5.replaceAll("\\d+", "数字");
//		System.out.println(str5);		
	}

}
