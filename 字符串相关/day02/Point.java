package day02;
/**
 * �����ÿһ��ʵ������������ά����ϵ�ϵ�һ����
 * ʹ�ø������Object��ط���
 * @author Administrator
 *
 */
public class Point {
	private int x;
	private int y;
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	/*
	 * ��дtoString����
	 */
	public String toString(){
		return "x="+x+"        y="+y;
	}
	/*
	 * ��дequals����
	 */
	public boolean equals(Object o){
		if(o==null){
			return false;
		}
		if(o==this){
			return true;
		}
		if(o instanceof Point){
			Point p=(Point)o;
			return this.x==p.x && this.y==p.y;
		}
		return false;
	}
	public static void main(String args[]){
		Point p=new Point(1,2);
		Point p1=new Point(1,2);
		System.out.println(p==p1);//false
		System.out.println(p.equals(p1));//����д����false
		
		//Ĭ�ϵ�toString��ȡ���Ƕ���ľ��
		//system.out.println����ľ��Ƕ���
		String str=p.toString();
		System.out.println(str);
	}

}
