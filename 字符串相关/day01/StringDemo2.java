package day01;
/**
 * StringBuilder
 * Ƶ���޸��ַ�������������(��Դ���Ĺ���)����ѡ[�������ֻ�ܸĳ���]
 * @author Administrator
 */
public class StringDemo2 {
	public static void main(String[] args) {
		/*
		 * StringBuilder�ṩ�˶��ַ����༭����ط�����
		 * ����append
		 * ɾ��delete
		 * �ģ�replace
		 * �壺insert
		 * ����reverse
		 */
		String str="Ŭ��ѧϰjava";
		StringBuilder builder=new StringBuilder(str);
		
		//�Ż����룺���¶��ϣ���������
		
		
		//Ŭ��ѧϰjava��Ϊ���Ҹ��ù���
		//append�����ڵ�ǰ�ַ���ĩβ׷�Ӹ����ַ���
		builder.append("��Ϊ���Ҹ��ù���");
		str=builder.toString();
		System.out.println(str);
		
		//Ŭ��ѧϰjava��Ϊ�˸ı�������ù���
		builder.replace(11, 12, "�ı�����");
		str=builder.toString();
		System.out.println(str);
		
		//Ŭ��ѧϰ��Ϊ�˸ı�����
		//delete������ɾ��ָ����Χ�ڵ��ַ���
		builder.delete(4, 8);
		str=builder.toString();
		System.out.println(str);
		
		
		//С��Ŭ��ѧϰ��Ϊ�˸ı�����
		/*
		 * insert(int offset,String str)
		 * �ڸ���λ��offset�������ַ���str
		 * ԭλ�ü��Ժ���ַ��������Զ�����ƶ�
		 */
		builder.insert(0, "�ǲ�˹");
		str=builder.toString();
		System.out.println(str);
		
		//��ת�ַ�
		builder.reverse();
		str=builder.toString();
		System.out.println(str);
		
	}
}
