package day04;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ���У��洢һ������
 * ��ȡԪ�ر�����ѭ�Ƚ��ȳ�ԭ��
 * ��FIFO First Input First Output��
 * @author wangxin
 *
 */
public class QueueDemo {
	public static void main(String[] args){
		Queue<String>queue=new LinkedList<String>();
		//��ӷ���offer
		queue.offer("��");
		queue.offer("��");
		queue.offer("��");
		queue.offer("��");
		queue.offer("��  @-@");
		System.out.println(queue);
		/*
		 * �����ǽ���ϣ�����ö���Ԫ�أ�
		 * ����ϣ����Ԫ�س��ӣ����Ե���peek����
		 */
//		String hh=queue.peek();
//		System.out.println(hh);
//		System.out.println(queue);
//		
//		//���ӷ���
//		String str=queue.poll();
//		System.out.println(str);
//		System.out.println(queue);
		
		for (int i = queue.size(); i > 0; i--) {
			String s=queue.poll();
			System.out.println(s);
		}
		//while���
//		while (queue.size()>0) {
//			String s=queue.poll();
//			System.out.println(s);
//		}
		System.out.println(queue);
		
		
		
	}
}
