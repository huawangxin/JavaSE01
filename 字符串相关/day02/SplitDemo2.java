package day02;
/**
 * Ϊ������������
 * @author wangxin
 *
 */
public class SplitDemo2 {
	public static void main(String args[]){
		String imgName="1.jpg";
		/*
		 * 1:�ȸ��ݡ���������ַ���
		 * 2����ȡ��ǰϵͳʱ��ĺ���ֵ
		 * 3���ú���ֵƴ��һ����������ƴ�Ϻ�׺
		 */
		String[] names=imgName.split("\\.");   //split�õ�������ʽ. �ǿ�ָ������
		String name=System.currentTimeMillis()+"";
		imgName=name+"."+names[1];
		System.out.println(imgName);
		
	}

}
