package day01;
/**
 *使用chatAt判断字符串是否为“回文”
 * @author Administrator
 *
 */
public class ChatAtDemo2 {

	public static void main(String args[]){
		/*
		 * 思路：
		 * 判断回文的原则：
		 * 正数位置上的字符与倒数位置上的字符一致
		 */
		String str ="上海自来水来自海上";
		
		for(int i=0;i<str.length()/2;i++){
			int last=str.length()-1-i;
			if(str.charAt(i)!=str.charAt(last)){
				System.out.println("不是回文！");
				return;
			}
		}
		System.out.println("是回文");
	}
}
