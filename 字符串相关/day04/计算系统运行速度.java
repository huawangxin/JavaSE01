package day04;

public class ����ϵͳ�����ٶ� {
	public static void main(String[] args) {
		//��ʼʱ��
		long startTime=System.currentTimeMillis();
		int sum=0;
		for(int i=1;i<1000000;i++){
			sum+=i;
		}
		long stopTime=System.currentTimeMillis();
		//�����ʱ
		System.out.println("��ʱ�� "+(stopTime-startTime)/1000000+"���� ");
	}

}
