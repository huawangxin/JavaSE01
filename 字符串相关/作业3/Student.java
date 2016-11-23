package ื๗าต3;


class Student {
   	int age;
 	 void showInfo(){
 		 System.out.println("showinfo ()");
	  }
	  void showInfo(int sage){
  		System.out.println("showinfo (isage)"+sage);
	  }
 	 void showInfo(double sage){
 		 System.out.println("showinfo (dsage)"+sage);
	  }
  	public static void main(String []args){
  	  	Student s=new Student();
    		s.showInfo();
   		 s.showInfo(12.5);
	}
}
