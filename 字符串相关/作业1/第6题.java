package ��ҵ1;
/**
 * 
 * @author wangxin
 *
 */
public class ��6�� {
	public static void main(String[] args) {
		/*
		 * ������unicode�����еķ�Χ
		 * 4e00----9fa5
		 * 1,ѭ�����ÿһ���ַ�
		 * 2��ÿ����50�����֣���дһ�����з�
		 * 
		 * ˼����
		 * 1��Ƶ�����ڵ�ǰ�ַ�������׷�������ɵĽ����ʹ��StringBuilder
		 * 2����Ϊÿ50���־�Ҫ���н��������һ�����������ڼ�ס�����˶����ַ������Զ�50ȡ��   
		 * 
		 */
		int sum=0;
		StringBuilder builder=new StringBuilder();
		for(char c='\u4e00';c<='\u9fa5';c++){
			builder.append(c);
			sum++;
			if(sum%50==0){
				builder.append("\n");
			}
		}
		String str=builder.toString();
		System.out.println(sum);
		System.out.println(str);
	}

}
