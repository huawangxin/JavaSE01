package day04;

public class 计算系统运行速度 {
	public static void main(String[] args) {
		//开始时间
		long startTime=System.currentTimeMillis();
		int sum=0;
		for(int i=1;i<1000000;i++){
			sum+=i;
		}
		long stopTime=System.currentTimeMillis();
		//输出耗时
		System.out.println("耗时： "+(stopTime-startTime)/1000000+"毫秒 ");
	}

}
