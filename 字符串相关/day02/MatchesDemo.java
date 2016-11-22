package day02;
/**
 * 字符串的matches方法用于验证当前字符串是否满足给定的正确表达式的格式要求
 * @author Administrator
 *
 */
public class MatchesDemo {
	public static void main(String args[]){
		/*
		 * 身份证号的验证
		 * \d{17}[0-9xX]
		 */
		String id="1111111111111111";
		String regex="\\d{17}[0-9xX]";
		/*
		 * String regex="^\\d{17}[0-9xX]$";
		 * ----matches默认全匹配，不论是否书写了^或$
		 * "^\\d{17}[0-9xX]$"
		 * matches 匹配成功返回true，失败为false
		 */
		boolean match=id.matches(regex);
		if(match){
			System.out.println("是一个身份证");
		}else {
			System.out.println("不是一个身份证");
		}
	}

}
