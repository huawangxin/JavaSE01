package ��ҵ1;

/**
 * 
 * @author wangxin
 *
 */
public class SubString {
	public static void main(String args[]){
		String str="someapp/manage/emplist.action";
		/*
		 * ��һ���ҵ����һ��"/"��λ��
		 * �ڶ��� �����һ��λ�ô���ȡ��ĩβ
		 */
		int index=str.lastIndexOf("/");
		String sub=str.substring(index+1);
		System.out.println(sub);
	}

}
