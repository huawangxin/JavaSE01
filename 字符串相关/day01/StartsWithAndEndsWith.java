package day01;
/**
 * ���һ���ַ����Ƿ����Ը������ַ�����ʼ�Ļ��β��
 * @author Administrator
 *
 */
public class StartsWithAndEndsWith {
	public static void main(String args[]){
		String str="Thinking in Java";
		boolean start=str.startsWith("T");
		boolean end=str.endsWith("Java");
		System.out.println("�Ƿ���T��ͷ��"+start);
		System.out.println("�Ƿ���Java��β��"+end);
	}
}
