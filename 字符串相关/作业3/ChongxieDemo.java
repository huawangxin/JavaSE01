package ��ҵ3;

public class ChongxieDemo {
	public static void main(String[] args) {
//		Father f=new son();
//		f.run();
		Father.run();
		son.run();
		son s=new son("�߸�˧","��Ǯ","���޵���","������");
		if(׷Ů��(s.str1)){
			System.out.println("��һ�ַ�ʽ�ɹ���");
		}else {
			System.out.println("��һ�ַ�ʽʧ�ܣ�");
		}
		if(׷Ů��(s.str3,s.str4)){
			System.out.println("�ڶ��ַ�ʽ�ɹ���");
		}else {
			System.out.println("�ڶ��ַ�ʽʧ�ܣ�");
		}
		
		
		
	}
	public static boolean ׷Ů��(String str){
		if(str.equals("�߸�˧")){
			return true;
		}
		return false;
	}
	public static boolean ׷Ů��(String str1,String str2){
		if(str2.equals("��Ǯ")){
			return true;
		}
		if(str1.equals("���޵���")&&str2.equals("������")){
			return true;
		}
		return false;
	}
}
class Father{
	public static void run(){
		System.out.println("�ϰ�����");
	}
}
class son extends Father{
	String str1;
	String str2;
	String str3;
	String str4;
	
	
	public son(String str1, String str2, String str3, String str4) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		this.str3 = str3;
		this.str4 = str4;
	}


	public static void run(){
		System.out.println("׷��Ů������");
	}
}
//���Ծ�����
//��д������