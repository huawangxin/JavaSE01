package ��ҵ5;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/**
 * ʹ��hashMap�Ż��洢
 * @author wangxin
 *
 */
public class test04 {
	public static void main(String[] args) {
//		Map map1=new HashMap(1000000);
		Map<String, Integer> map=new HashMap<String,Integer>();
		map.put("����", 59);
		map.put("��ѧ", 59);
		map.put("Ӣ��", 59);
		map.put("��ѧ", 59);
		//����key
//		Set<String> keySet=map.keySet();
//		for(Iterator<String> i=keySet.iterator();i.hasNext();){
//			String key=i.next();
//			Integer value=map.get(key);
//			System.out.println(key+":"+value);
//		}
		//����entry
		//ע�⵼���𵼴�
		Set<Entry<String, Integer>> entries=map.entrySet();
		for(Entry<String, Integer> e:entries){
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println(key+":"+value);
		}
		
		
		
	}
}
