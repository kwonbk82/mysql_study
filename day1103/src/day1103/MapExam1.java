package day1103;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExam1 {
	public static void main(String[] args) {
		Map map = new HashMap();
		
		map.put("a", 100);
		map.put("b", 200);
		map.put("c", 300);
		
		Set<String> keySet = map.keySet();
		for(String str : keySet) {
			System.out.println("key : "+str);
			System.out.println("value : "+map.get(str));
		}
		
		System.out.println("-----------------------");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> e : entrySet) {
			System.out.println("key : "+e.getKey());
			System.out.println("value : "+e.getValue());
		}
	}
}
