package day04;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Deque是双端队列，队列的两端均可以入队与出队
 * 当我们限制程序只能从队列的一段出队与入队
 * 就形成了经典的数据结构“栈”
 * 栈存储元素遵循先进先出原则
 * （FILO First Input last output）
 * @author wangxin
 *
 */
public class DequeDemo {
	public static void main(String[] args) {
		Deque<String> stack=new LinkedList<String>();
		//入栈方法 push
		stack.push("one");
		stack.push("two");
		stack.push("three");
		stack.push("four");
		stack.push("five");
		//引用。但不出栈
//		System.out.println(stack);
//		String str=stack.peek();
//		System.out.println(str);
//		System.out.println(stack);
		
		while(stack.size()>0){
			String str1=stack.pop();
			
			System.out.println(str1);
		}
		System.out.println(stack);
		/*
		 * 栈在实际应用中通常都是用于实现耨一个系列的
		 * 操作有可塑性
		 * 可以使用栈完成“前进”，“后退”
		 */
		
		
		
	}
}
