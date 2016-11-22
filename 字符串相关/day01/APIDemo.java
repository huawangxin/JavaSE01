package day01;
/**
 * 这个类的作用是用来练习文档注释的，
 * 没什么其他用
 * @author Administrator
 * @version 1.0001
 * @see java.lang.String
 * @since JDK6.0
 */
public class APIDemo {
	/**
	 * 这是一个常量，用于说明状态
	 * 1表示正常（这里结合业务需求）
	 */
	public static final int STATE=1;
	/**
	 * 这个方法会根据给定的手机号获取对应该手机号所设置的消息
	 * @param phoneNum 传入的11位手机号码
	 * @return 对应的消息，若为null，表示没有消息
	 * @throws Exception 输入的手机号格式不对
	 * 
	 * translate.google.com 谷歌翻译
	 * bing
	 */
	public String getMessage(int phoneNum){
		return null;
	}
}


//注释 可以添加在3个地方  ：类、常量、方法前面
//java doc生成文档