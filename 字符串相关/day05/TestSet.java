package day05;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		new HashSet().add("qwe");
		Map<String, Emp> map=new HashMap<String, Emp>();
		map.put("zs", new Emp("zs", 12));
		map.put("ls", new Emp("ls", 12));
		map.put("ws", new Emp("ws", 12));

		//1
		Set<Entry<String,Emp>> set=map.entrySet();
		Iterator<Entry<String,Emp>> it=set.iterator();
		while(it.hasNext()){
			Entry<String,Emp> entry=it.next();
			String key=entry.getKey();
			Emp value=entry.getValue();
			System.out.println(key+","+value);
		}
		
		//2
		Set<String> keys=map.keySet();
		Iterator<String> it2=keys.iterator();
		while(it2.hasNext()){
			String key=it2.next();
			Emp value=map.get(key);
			System.out.println(key+","+value);
		}
		
		
	}
}
