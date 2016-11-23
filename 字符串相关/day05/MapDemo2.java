package day05;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * ����map,�������е�key
 * @author wangxin
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String,Integer>();
		map.put("����", 59);
		map.put("��ѧ", 59);
		map.put("Ӣ��", 59);
		map.put("��ѧ", 59);
		System.out.println(map);
		/*
		 * �������е�key
		 * set,keyset()
		 * �÷����Ὣmap�е����е�key����һ��
		 * set�����з���
		 * �������Ǳ������е�key����Ҫ��ȡ�ü���
		 * �������ü��ϼ��ɡ�
		 */
		Set<String> keySet=map.keySet();
		for(String key:keySet){
			System.out.println("key:"+key);
		}
		/*
		 * ����ÿһ���ֵ��
		 * set entryset()
		 * �÷������ȡһ��set���ϣ��ü����д�����ɸ�entry��ʵ����ÿһ��entry
		 * ʵ���ڲ����������ԣ��ֱ𱣴�key,value��
		 * ���������Ǳ���ÿһ��entryʵ�������൱���������ÿһ���ֵ�ԡ�
		 * Entry�ķ�������Ӧ�����Ӧ��map����ķ�������һ��
		 */
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		Iterator<Entry<String,Integer>> it=entrySet.iterator();
		while(it.hasNext()){
			Entry<String,Integer> entry=it.next();
			String key=entry.getKey();
			int value=entry.getValue();
			System.out.println(key+"="+value);
		}
		/*
		 * �������е�value��������
		 */
		Collection<Integer> values=map.values();
		for(int value:values){
			System.out.println("value1:"+value);
		}
	}
}
