package ื๗าต1;

class Test3 {
	public Test3(){
		System.out.println("111");
	}
}
public class Test2 extends Test3{
	public Test2(){
		//super();
		System.out.println("333");
	}
	public static void main(String[] args) {
		Test3 test2=new Test2();
	}
}