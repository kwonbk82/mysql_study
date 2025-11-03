package day1103;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExam2 {
	public static void main(String[] args) {
		Map<Integer,String> map = new TreeMap<>();
		map.put(1, "aaa");
		map.put(2, "bbb");
		map.put(3, "ccc");
		
//		Set<Map.Entry<Integer,String>> entry =map.entrySet();
		for(Map.Entry<Integer,String> e : map.entrySet()) {
			System.out.println(e.getKey()+"/"+e.getValue());

		}
		
//		Set<String> keySet = map.keySet();
		for(Integer i : map.keySet()) {
			System.out.println("key : "+i);
			System.out.println("value : "+map.get(i));
		}
		
			
		Iterator<Map.Entry<Integer,String>> entry = map.entrySet().iterator();
		while(entry.hasNext()) {
			Map.Entry<Integer,String> e = entry.next();
			System.out.println(e.getKey()+"/"+e.getValue());
		}
		
		Iterator<Integer> keyIt = map.keySet().iterator();
		while(keyIt.hasNext()) {
			int key = keyIt.next();
			System.out.println(key+":"+map.get(key));
		}
	}
}
