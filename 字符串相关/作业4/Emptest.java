package ��ҵ4;
//.java��.class  ����    
public class Emptest {
	public static void main(String[] args) {
		System.out.println(Emp.cname);
		Emp e=new Emp();
		e.name1="����";
		System.out.println(e.name1);
		e.cname="����";//��������ôд
		
		e=new Emp();
		e.name1="�Ŵӿ�";
		System.out.println(e.name1);
		Emp.cname="����";
		System.out.println(Emp.cname);
		System.out.println(e.toString());//�����о͵�������ģ�û�о͵��ø����
		
		Emp e1=new Emp(new String("�Ŵӿ�"));
		System.out.println(e1.equals(e));
	}
}
