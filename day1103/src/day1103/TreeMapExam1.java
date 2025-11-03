package day1103;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExam1 {
	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<>();
		
		map.put(90,"김재박");
		map.put(60,"김마이");
		map.put(40,"김디비");
		map.put(80,"김쟈가");
		map.put(70,"김자바");
		
		System.out.println(map.ceilingEntry(80));
		System.out.println(map.ceilingKey(80));
		System.out.println(map.floorEntry(80));
		System.out.println(map.floorKey(80));
		System.out.println(map.replace(80,"oracle"));
		
		System.out.println("---------------------------");
		Map.Entry<Integer,String> entry = null;
		entry = map.firstEntry();
		System.out.println(entry.getKey()+"/"+entry.getValue());
		
		entry = map.lastEntry();
		System.out.println(entry.getKey()+"/"+entry.getValue());
		
		entry = map.lowerEntry(90);
		System.out.println(entry.getKey()+"/"+entry.getValue());
		
		while(!map.isEmpty()) {
			entry = map.pollFirstEntry();
			System.out.println(entry.getKey()+"/"+entry.getValue());
			System.out.println("remained object : "+map.size());
		}

	}
}
