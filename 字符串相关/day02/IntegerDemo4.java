package day02;
/**
 * 包装类的自动拆装箱
 * @author wangxin
 *
 */
public class IntegerDemo4 {
	public static void main(String[] args) {
		int i=1;
		//从基本类型到引用类型的过程：装箱
		Integer in=new Integer(i);
		
		//从引用类型到基本类型的过程：拆箱
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
