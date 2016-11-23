package 作业3;

public class ChongxieDemo {
	public static void main(String[] args) {
//		Father f=new son();
//		f.run();
		Father.run();
		son.run();
		son s=new son("高富帅","有钱","会修电脑","会打代码");
		if(追女神(s.str1)){
			System.out.println("第一种方式成功！");
		}else {
			System.out.println("第一种方式失败！");
		}
		if(追女神(s.str3,s.str4)){
			System.out.println("第二种方式成功！");
		}else {
			System.out.println("第二种方式失败！");
		}
		
		
		
	}
	public static boolean 追女神(String str){
		if(str.equals("高富帅")){
			return true;
		}
		return false;
	}
	public static boolean 追女神(String str1,String str2){
		if(str2.equals("有钱")){
			return true;
		}
		if(str1.equals("会修电脑")&&str2.equals("会打代码")){
			return true;
		}
		return false;
	}
}
class Father{
	public static void run(){
		System.out.println("老爸慢跑");
	}
}
class son extends Father{
	String str1;
	String str2;
	String str3;
	String str4;
	
	
	public son(String str1, String str2, String str3, String str4) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		this.str3 = str3;
		this.str4 = str4;
	}


	public static void run(){
		System.out.println("追着女朋友跑");
	}
}
//面试经常考
//重写与重载