package day01;

/**
 * substring���ڻ�ȡһ���ַ����Ĳ�������
 * 
 * @author Administrator
 *
 */
public class SubstringDemo {

	public static void main(String[] args) {
		//            01234567890123
		String url = "www.oracle.com";
		/**
		 * ͨ������£����������ֱ�ʾ��Χʱ
		 * ���ǡ���ͷ����β����,��0��ʼ
		 */
		String sub =url.substring(4, 10);
		System.out.println(sub);
		/**
		 * һ��������ָ��λ�ý�ȡ���ַ���
		 */
		sub=url.substring(4);
		System.out.println(sub);
		
		url="http:/www.tarena.com.cn";
		/*
		 *˼·��
		 *��ȡ��һ���㣬��ڶ������λ��
		 *�����м���ַ������� 
		 */
		int one =url.indexOf(".");
		int two=url.indexOf(".",one+1);
		String s=url.substring(one+1,two);
		System.out.println(s);
	}
}
