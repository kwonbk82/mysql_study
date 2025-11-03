package day1103;

import java.util.HashMap;
import java.util.Map;

public class MapExam3 {
	public static void main(String[] args) {
		Map<Student,Integer> map = new HashMap<>();
		
		map.put(new Student(1,"김블루"), 96);
		map.put(new Student(1,"김블루"), 96);
		map.put(new Student(2,"김블루"), 96);
		
		System.out.println(map.size());
	}
}
