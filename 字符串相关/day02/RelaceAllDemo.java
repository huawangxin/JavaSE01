package day02;
/**
 * 
 * ������г���
 * @author wangxin
 *
 */
public class RelaceAllDemo {
	public static void main(String args[]){
		String regex="(sb|��ȥ�����˸���)";
		String message="С�ط��ͺ��ƣ�sbһ��";
		message=message.replaceAll(regex, "*****");
		System.out.println(message);
		
	}

}
