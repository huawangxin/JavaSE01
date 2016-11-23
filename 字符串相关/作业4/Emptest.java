package 作业4;
//.java到.class  编译    
public class Emptest {
	public static void main(String[] args) {
		System.out.println(Emp.cname);
		Emp e=new Emp();
		e.name1="郭健";
		System.out.println(e.name1);
		e.cname="张三";//不建议这么写
		
		e=new Emp();
		e.name1="张从宽";
		System.out.println(e.name1);
		Emp.cname="李四";
		System.out.println(Emp.cname);
		System.out.println(e.toString());//子类有就调用子类的，没有就调用父类的
		
		Emp e1=new Emp(new String("张从宽"));
		System.out.println(e1.equals(e));
	}
}
