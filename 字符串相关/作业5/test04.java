package 作业5;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/**
 * 使用hashMap优化存储
 * @author wangxin
 *
 */
public class test04 {
	public static void main(String[] args) {
//		Map map1=new HashMap(1000000);
		Map<String, Integer> map=new HashMap<String,Integer>();
		map.put("语文", 59);
		map.put("数学", 59);
		map.put("英语", 59);
		map.put("科学", 59);
		//迭代key
//		Set<String> keySet=map.keySet();
//		for(Iterator<String> i=keySet.iterator();i.hasNext();){
//			String key=i.next();
//			Integer value=map.get(key);
//			System.out.println(key+":"+value);
//		}
		//迭代entry
		//注意导包别导错
		Set<Entry<String, Integer>> entries=map.entrySet();
		for(Entry<String, Integer> e:entries){
			String key=e.getKey();
			Integer value=e.getValue();
			System.out.println(key+":"+value);
		}
		
		
		
	}
}
