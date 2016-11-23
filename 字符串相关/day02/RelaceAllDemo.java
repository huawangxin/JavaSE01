package day02;
/**
 * 
 * 构建和谐社会
 * @author wangxin
 *
 */
public class RelaceAllDemo {
	public static void main(String args[]){
		String regex="(sb|我去年买了个表)";
		String message="小地方就好似，sb一个";
		message=message.replaceAll(regex, "*****");
		System.out.println(message);
		
	}

}
