package day02;
/**
 * ��װ����Զ���װ��
 * @author wangxin
 *
 */
public class IntegerDemo4 {
	public static void main(String[] args) {
		int i=1;
		//�ӻ������͵��������͵Ĺ��̣�װ��
		Integer in=new Integer(i);
		
		//���������͵��������͵Ĺ��̣�����
		int c=in.intValue();
		
		in=i;
		//in=new Integer(i);
		i=in;
		//i=in.intValue();
		
		Integer h=Integer.valueOf(1);
		Integer hh=Integer.valueOf(1);
		System.out.println(h==hh);
		
		
	}

}
