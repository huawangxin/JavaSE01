package 作业5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * 统计一句话中重复字符的个数
 * @author wangxin
 *
 */
public class 第二题 {
	
	public void test1(){
		String str="good good study,day day up.";
		/*
		 * 1：创建一个map 
		 *    key：出现的字符
		 *    value：字符出现的次数
		 * 2：获取字符串中每一个字符
		 * 3：查看字符是否在MAP中作为key存在
		 *    存在：存在说明以前统计过了，只需要对value+1
		 *    不存在：说明没统计过，value设置为1
		 */
		str=str.replaceAll("[^a-zA-Z,.]+","");
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		System.out.println("各字符数量： "+map);
		/*
		 * 使用迭代key的方式遍历map集合
		 */
		Set<Character> keys=map.keySet();
		for(Character key:keys){
			System.out.println(key+":"+map.get(key));
		}
	}
	/*
	 * 使用迭代entry的方式遍历集合
	 * LinkedHashMap可以顺序遍历
	 */
	public void test3(){
		String str="good good study,day day up.";
		str=str.replaceAll("[^a-zA-Z,.]+","");
//		Map<Character,Integer> map=new HashMap<Character,Integer>();
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(map.containsKey(c)){
				//统计过，value+1
				map.put(c, map.get(c)+1);
			}else {
				//没统计过
				map.put(c, 1);
			}
		}
		Set<Map.Entry<Character,Integer>> entrys=map.entrySet();
		for(Map.Entry<Character,Integer> entry:entrys){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	
	
	
	
	public static void main(String[] args){
		new 第二题().test3();
	}
}
