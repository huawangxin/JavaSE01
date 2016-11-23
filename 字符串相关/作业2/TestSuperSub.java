package ื๗าต2;

public class TestSuperSub{
	
	  	 int age;
	  	TestSuperSub(){
	   		age=10; 
		  }
	  	TestSuperSub(int sage){
	 		age=sage;
		  }
		 void showAge(){
	  		System.out.println(age);
		  }
		 public static void main(String []args){
			 TestSuperSub s=new TestSuperSub();
	   		s.showAge();
	   		TestSuperSub s1=new TestSuperSub(12);
	   		s1.showAge();
		}
	

}
