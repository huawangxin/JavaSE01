package ��ҵ5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * ͳ��һ�仰���ظ��ַ��ĸ���
 * @author wangxin
 *
 */
public class �ڶ��� {
	
	public void test1(){
		String str="good good study,day day up.";
		/*
		 * 1������һ��map 
		 *    key�����ֵ��ַ�
		 *    value���ַ����ֵĴ���
		 * 2����ȡ�ַ�����ÿһ���ַ�
		 * 3���鿴�ַ��Ƿ���MAP����Ϊkey����
		 *    ���ڣ�����˵����ǰͳ�ƹ��ˣ�ֻ��Ҫ��value+1
		 *    �����ڣ�˵��ûͳ�ƹ���value����Ϊ1
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
		System.out.println("���ַ������� "+map);
		/*
		 * ʹ�õ���key�ķ�ʽ����map����
		 */
		Set<Character> keys=map.keySet();
		for(Character key:keys){
			System.out.println(key+":"+map.get(key));
		}
	}
	/*
	 * ʹ�õ���entry�ķ�ʽ��������
	 * LinkedHashMap����˳�����
	 */
	public void test3(){
		String str="good good study,day day up.";
		str=str.replaceAll("[^a-zA-Z,.]+","");
//		Map<Character,Integer> map=new HashMap<Character,Integer>();
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(map.containsKey(c)){
				//ͳ�ƹ���value+1
				map.put(c, map.get(c)+1);
			}else {
				//ûͳ�ƹ�
				map.put(c, 1);
			}
		}
		Set<Map.Entry<Character,Integer>> entrys=map.entrySet();
		for(Map.Entry<Character,Integer> entry:entrys){
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	
	
	
	
	public static void main(String[] args){
		new �ڶ���().test3();
	}
}
