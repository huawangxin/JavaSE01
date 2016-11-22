package day05;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 有序的map存放顺序与取出顺序一致
 * @author wangxin
 *
 */
public class MapDemo3 {
	public static void main(String[] args) {
		Map<String, Integer> map=new LinkedHashMap<String,Integer>();
		map.put("语文", 77);
		map.put("数学", 85);
		map.put("英语", 54);
		map.put("科学", 74);
		System.out.println(map);
		
		Set<Entry<String,Integer>> set=map.entrySet();
		for(Entry<String,Integer> entry:set){
			System.out.println(entry.getKey()+","+entry.getValue());
		}
	}
}
