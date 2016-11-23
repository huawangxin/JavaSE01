package day04;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 队列：存储一组数据
 * 存取元素必须遵循先进先出原则
 * （FIFO First Input First Output）
 * @author wangxin
 *
 */
public class QueueDemo {
	public static void main(String[] args){
		Queue<String>queue=new LinkedList<String>();
		//入队方法offer
		queue.offer("你");
		queue.offer("是");
		queue.offer("王");
		queue.offer("尼");
		queue.offer("玛  @-@");
		System.out.println(queue);
		/*
		 * 若我们仅仅希望引用队首元素，
		 * 而不希望该元素出队，可以调用peek方法
		 */
//		String hh=queue.peek();
//		System.out.println(hh);
//		System.out.println(queue);
//		
//		//出队方法
//		String str=queue.poll();
//		System.out.println(str);
//		System.out.println(queue);
		
		for (int i = queue.size(); i > 0; i--) {
			String s=queue.poll();
			System.out.println(s);
		}
		//while最好
//		while (queue.size()>0) {
//			String s=queue.poll();
//			System.out.println(s);
//		}
		System.out.println(queue);
		
		
		
	}
}
