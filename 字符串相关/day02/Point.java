package day02;
/**
 * 该类的每一个实例用于描述二维坐标系上的一个点
 * 使用改类测试Object相关方法
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
	 * 重写toString方法
	 */
	public String toString(){
		return "x="+x+"        y="+y;
	}
	/*
	 * 重写equals方法
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
		System.out.println(p.equals(p1));//不重写就是false
		
		//默认的toString获取的是对象的句柄
		//system.out.println输出的就是对象
		String str=p.toString();
		System.out.println(str);
	}

}
