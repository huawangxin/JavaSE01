package day01;
/**
 *ʹ��chatAt�ж��ַ����Ƿ�Ϊ�����ġ�
 * @author Administrator
 *
 */
public class ChatAtDemo2 {

	public static void main(String args[]){
		/*
		 * ˼·��
		 * �жϻ��ĵ�ԭ��
		 * ����λ���ϵ��ַ��뵹��λ���ϵ��ַ�һ��
		 */
		String str ="�Ϻ�����ˮ���Ժ���";
		
		for(int i=0;i<str.length()/2;i++){
			int last=str.length()-1-i;
			if(str.charAt(i)!=str.charAt(last)){
				System.out.println("���ǻ��ģ�");
				return;
			}
		}
		System.out.println("�ǻ���");
	}
}
