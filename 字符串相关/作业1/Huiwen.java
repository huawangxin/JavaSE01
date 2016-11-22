package 作业1;
/**
 * 
 * @author wangxin
 *
 */
public class Huiwen {
	public static void main(String[] args) {
		String str="上海自来水来自海上";
		/*
		 * 1，建立一个substring;
		 * 2,调用reverse
		 * 3,if函数判断str是否等于str1
		 * 4,不一致则不是回文
		 * 5,一致则为回文
		 */
		StringBuilder builder=new StringBuilder(str);
		builder.reverse();String str1=builder.toString();
		if(str.equals(str1)){
			System.out.println("是回文");
		}else {
			System.out.println("不是回文");
		}
	}

}
