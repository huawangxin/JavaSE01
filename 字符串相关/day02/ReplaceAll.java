package day02;

/**
 * replaceAll�������ڽ���ǰ�ַ���������������ʽ�Ĳ����滻Ϊ�������ַ���
 * @author wangxin
 *
 */
public class ReplaceAll {
	public static void main(String args[]){
		/*
		 * ��str�������������Ϊ��#number#��
		 */
		String str="sdas4434h4j4j4j4j4j4j";
		String replace=str.replaceAll("[0-9]+", "#number#");
		System.out.println(replace);
		
//		String str5="abc2332ddd444nn4mm4";
//		str5=str5.replaceAll("\\d+", "����");
//		System.out.println(str5);		
	}

}
