package ��ҵ2;
/**
 * ��д����������ʽ���ֱ�����֤���ʱ࣬�ֻ�������֤
 * @author Administrator
 *�����඼�Ǿ�̬����
 */
public class RegExtils {
	public static final String 
	ID_NUMBER="^[0-9]{15}([0-9]{2}[0-9xX])?$";
	public static final String ZIP_CODE="\\d{6}";
	public static final String PHONE_NUMBER="\\d{11}";
	/**
	 * ���ݸ�����������ʽ��֤�������ַ����Ƿ������ʽҪ��
	 * @param str  ��Ҫ��֤��ʽ���ַ���
	 * @param regex ��֤��ʽ��������ʽ
	 * @return  true������������ʽҪ��  false��������
	 */
	public static boolean check(String str,String regex){
		return str.matches(regex);
	}
	public static void main(String args[]){
		String str ="110104191987021245";
		boolean tf=check(str, RegExtils.ID_NUMBER);
		if(tf){
			System.out.println("�����֤��");
		}else {
			System.out.println("�Ǻ�");
		}
	}
	
	
	
}
