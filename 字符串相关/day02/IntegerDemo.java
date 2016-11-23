package day02;
/**
 * 
 * @author Administrator
 *
 */
public class IntegerDemo {
	public static void main(String args[]){
		dosome("123123");
		dosome(new Point(1, 2));
		int i=1;
		Integer ii=new Integer(i);
//		int o=ii.eevalue();
		dosome(i);
		
		
		double d=1.2;
		Double dd=new Double(d);
		double ddd=dd.doubleValue();
		int s=dd.intValue();
		System.out.println(s);
		
		
	}
	public static void dosome(Object o){
		System.out.println(o);
	}

}
//·â×°
//class Integer{
//	private int i;
//	public Integer(int i){
//		this.i=i;
//	}
//	public int eevalue(){
//		return i;
//	}
//}