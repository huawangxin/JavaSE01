package day05;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * �����map���˳����ȡ��˳��һ��
 * @author wangxin
 *
 */
public class MapDemo3 {
	public static void main(String[] args) {
		Map<String, Integer> map=new LinkedHashMap<String,Integer>();
		map.put("����", 77);
		map.put("��ѧ", 85);
		map.put("Ӣ��", 54);
		map.put("��ѧ", 74);
		System.out.println(map);
		
		Set<Entry<String,Integer>> set=map.entrySet();
		for(Entry<String,Integer> entry:set){
			System.out.println(entry.getKey()+","+entry.getValue());
		}
	}
}
