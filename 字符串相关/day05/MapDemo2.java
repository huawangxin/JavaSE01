package day05;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 遍历map,遍历所有的key
 * @author wangxin
 *
 */
public class MapDemo2 {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String,Integer>();
		map.put("语文", 59);
		map.put("数学", 59);
		map.put("英语", 59);
		map.put("科学", 59);
		System.out.println(map);
		/*
		 * 遍历所有的key
		 * set,keyset()
		 * 该方法会将map中的所有的key存入一个
		 * set集合中返回
		 * 所以我们遍历所有的key秩序要获取该集合
		 * 并遍历该集合即可。
		 */
		Set<String> keySet=map.keySet();
		for(String key:keySet){
			System.out.println("key:"+key);
		}
		/*
		 * 遍历每一组键值对
		 * set entryset()
		 * 该方法会获取一个set集合，该集合中存放若干个entry的实例，每一个entry
		 * 实例内部有两个属性，分别保存key,value。
		 * 这样，我们遍历每一个entry实例，就相当于与遍历了每一组键值对。
		 * Entry的泛型类型应当与对应的map定义的泛型类型一致
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
		 * 遍历所有的value，不常用
		 */
		Collection<Integer> values=map.values();
		for(int value:values){
			System.out.println("value1:"+value);
		}
	}
}
