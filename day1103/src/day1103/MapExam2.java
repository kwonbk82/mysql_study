package day1103;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("김블루", 90);
		map.put("김", 10);
		map.put("김루", 50);
		map.put("블루", 80);
		System.out.println(map.size());
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIt = keySet.iterator();
		
		while(keyIt.hasNext()) {
			String key = keyIt.next();
			Integer value = map.get(key);
			System.out.println(">>"+key+":"+value);
		}
		
		map.remove("김루");
		System.out.println("삭제후 : "+map.size());
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIt = entrySet.iterator();
		int sum=0;
		int max=0;
		int min=100;
		while(entryIt.hasNext()) {
			Map.Entry<String, Integer> entry = entryIt.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(">>"+key+":"+value);
			
			sum+=value;
			if(value>max) max=value;
			if(value<min) min=value;
		}
		
		Collection<Integer> values = map.values();
		
		System.out.println("sum :"+sum);
		System.out.println("max :"+Collections.max(values));
		System.out.println("min :"+Collections.min(values));
		
	}
}
