package day02;
/**
 * �ַ�����matches����������֤��ǰ�ַ����Ƿ������������ȷ���ʽ�ĸ�ʽҪ��
 * @author Administrator
 *
 */
public class MatchesDemo {
	public static void main(String args[]){
		/*
		 * ���֤�ŵ���֤
		 * \d{17}[0-9xX]
		 */
		String id="1111111111111111";
		String regex="\\d{17}[0-9xX]";
		/*
		 * String regex="^\\d{17}[0-9xX]$";
		 * ----matchesĬ��ȫƥ�䣬�����Ƿ���д��^��$
		 * "^\\d{17}[0-9xX]$"
		 * matches ƥ��ɹ�����true��ʧ��Ϊfalse
		 */
		boolean match=id.matches(regex);
		if(match){
			System.out.println("��һ�����֤");
		}else {
			System.out.println("����һ�����֤");
		}
	}

}
