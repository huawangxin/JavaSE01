package 作业2;
/**
 * 编写三个正则表达式，分别对身份证，邮编，手机进行验证
 * @author Administrator
 *工具类都是静态方法
 */
public class RegExtils {
	public static final String 
	ID_NUMBER="^[0-9]{15}([0-9]{2}[0-9xX])?$";
	public static final String ZIP_CODE="\\d{6}";
	public static final String PHONE_NUMBER="\\d{11}";
	/**
	 * 根据给定的正则表达式验证给定的字符串是否满足格式要求
	 * @param str  需要验证格式的字符串
	 * @param regex 验证格式的正则表达式
	 * @return  true：满足条件格式要求  false：不满足
	 */
	public static boolean check(String str,String regex){
		return str.matches(regex);
	}
	public static void main(String args[]){
		String str ="110104191987021245";
		boolean tf=check(str, RegExtils.ID_NUMBER);
		if(tf){
			System.out.println("是身份证号");
		}else {
			System.out.println("呵呵");
		}
	}
	
	
	
}
