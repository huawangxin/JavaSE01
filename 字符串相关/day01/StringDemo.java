package day01;
/**
 * �ַ����������Ĳ���
 * @author Administrator
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		//��������ֱ����
		//java���ַ����Ż���
		String a="ss";
		String str="sssss";
		String str2="sssss";
		String str3="sssss";
		String str4="ss"+"sss";
		String str5=a+"sss";
//		str+="!";
//		System.out.println(str2);
		System.out.println(str==str2);//˫���ھ������õ�ַһ��
		System.out.println(str==str3);
		System.out.println(str==str4);
		System.out.println(str==str5);
		System.out.println(a);
		/**
		 * java�ڱ����ʱ������һ���Ż���
		 * �����м������ߵ����ݶ���������ʱ����������㣬�������ֽ����ļ��У����ɳ���
		 * String str4="helloworld";
		 */
		String s1="abc123";
		String s2="abc"+123;
//		String s3=1+"2"+3+"abc";
		String s3="abc"+1+"2"+3;
		String s4=1+2+"3"+"abc";
//		String s5='1'+2+"3"+"abc";
		String s5="abc"+'1'+2+"3";
		String s6="1"+'2'+3+"abc";
		//true
		System.out.println(s1==s2);
		//true
		System.out.println(s1==s3);
		//false
		System.out.println(s1==s4);
		//true
		System.out.println(s1==s5);
		//false
		System.out.println(s1==s6);
	}
}
