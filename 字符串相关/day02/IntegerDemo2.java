package day02;
/**
 * 将字符串转换为对应的基本类型
 * @author Administrator
 *
 */
public class IntegerDemo2 {
	public static void main(String args[]){
		String str="123";
		int i=Integer.parseInt(str);
		i++;
		System.out.println(i);
		
		double d=Double.parseDouble(str);
		d++;
		System.out.println(d);
	}
}
