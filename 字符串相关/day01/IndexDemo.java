package day01;
/**
 * �ַ�����indexOf���������ڲ����ַ�����λ��
 * @author Administrator
 *
 */
public class IndexDemo {
	public static void main(String[] args) {
		String str="thinking in java";
		int index=str.indexOf("java");
		System.out.println(index);
		/**
		 * ��ָ��λ�ÿ�ʼ���ҵ�һ�γ��ָ����ַ�����λ��
		 */
		index=str.indexOf("in",9);
		System.out.println(index);
		/**
		 * ��ָ��λ�ÿ�ʼ�������һ�γ��ָ����ַ�����λ��
		 */
		index=str.lastIndexOf("in");
		System.out.println(index);
	}
}
