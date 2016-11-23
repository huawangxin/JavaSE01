package ื๗าต1;
public class Main{
	String str=new String("good");
	char[]ch={'a','b','c'};
	public static void main(String args[]){
	Main ex=new Main();
	ex.change(ex.str,ex.ch);
	System.out.print(ex.str+" and ");
	System.out.print(ex.ch);
	} 
	public void change(String str,char ch[]){
		str="test ok";
		ch[0]='g';
		} 
	}