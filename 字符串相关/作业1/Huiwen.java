package ��ҵ1;
/**
 * 
 * @author wangxin
 *
 */
public class Huiwen {
	public static void main(String[] args) {
		String str="�Ϻ�����ˮ���Ժ���";
		/*
		 * 1������һ��substring;
		 * 2,����reverse
		 * 3,if�����ж�str�Ƿ����str1
		 * 4,��һ�����ǻ���
		 * 5,һ����Ϊ����
		 */
		StringBuilder builder=new StringBuilder(str);
		builder.reverse();String str1=builder.toString();
		if(str.equals(str1)){
			System.out.println("�ǻ���");
		}else {
			System.out.println("���ǻ���");
		}
	}

}
