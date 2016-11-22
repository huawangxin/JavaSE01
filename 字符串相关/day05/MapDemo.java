package day05;

import java.util.HashMap;
import java.util.Map;

/**
 * map看起来像是一个多行两列的表格 以key-value对的形式保持数据
 * 
 * @author wangxin
 *
 */
public class MapDemo {
	public static void main(String[] args) {
		// java.util.Map
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("语文", 119);
		map.put("数学", 199);
		map.put("英语", 119);
		map.put("科学", 99);
		// 输出Map中的元素个数
		System.out.println(map.size());
		// 输出Map的toString
		System.out.println(map);
		/*
		 * 若Key在map中不存在，会将给定的key与value存入map，返回值null 所以要注意，若value是一个包装类，那么
		 * 我们获取put返回值是应使用包装类是接收，而不能使用基本类型， 因为会涉及到隐式的自动拆箱，导致空指针异常。
		 */
		Integer num = map.put("科学", 88);
		Integer num1 = map.put("科学", 88);

		/*
		 * 使用Map中已有的key添加新value，则是替换value操作， put方法会将替换的value返回
		 */
		// int num1=map.put("科学", 88);
		System.out.println(map);
		System.out.println(num);
		System.out.println(num1);
		/*
		 * Map中获取元素的方式是根据给定的key获取对应的value，若给定的key在map中不存在，则返回值为null v get(K k)
		 */
		num = map.get("语文");
		System.out.println("语文:" + num);

		num = map.get("体育");
		System.out.println("体育：" + num);
		/*
		 * 删除元素 V remove(K k) 根据给定的key删除当前key-value对 若key存在，返回值为当前key对应的value
		 * 拖key不存在，则返回null
		 */
		System.out.println(map);
		num = map.remove("语文");
		System.out.println(num);
		System.out.println(map);
		/*
		 * boolean containskey(k k)
		 * 查看当前map中是否包含给定的key
		 */
		boolean has=map.containsKey("手工");
		System.out.println("是否包含收手工："+has);
		
		
	}
}
