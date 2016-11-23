package day04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Collections（集合的工具类）  与Collection(集合的副接口）  
/**
 * List集合的排序
 * 对set集合排序通常是无意义的
 * @author wangxin
 *
 */
public class ListDemo6 {
	public static void main(String[] args){
		List<Integer> list=new ArrayList<Integer>();
		/*
		 * 生成10个随机数放入集合
		 */
		Random random=new Random();
		for(int i=0;i<10;i++){
			list.add(random.nextInt(100));
		}
		System.out.println(list);
		/*
		 * Collection.sort方法
		 * 会对集合自然排序（由小到大）
		 */
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
	}
}
