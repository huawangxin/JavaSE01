package day01;

public class StringDemo3 {

	public static void main(String[] args) {
		StringBuilder builder=new StringBuilder("a");
		for(int i=0;i<100000000;i++){
			builder.append("a");
		}System.out.println("¼ÆËã½áÊøÁË£¡");
	}
}
