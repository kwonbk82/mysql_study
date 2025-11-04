package day1104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class MapExam2 {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter country and population >> ");
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+". nation info > ");
		String con = scan.next();
		int num = scan.nextInt();
		
		map.put(con,num);
		}
		Set <String> set = map.keySet();
		Iterator<String> it = set.iterator();
		
		int maxPop = 0;
		String maxNation = null;
		
		while(it.hasNext()) {
			String name = it.next();
			Integer pop = map.get(name);
			
//			System.out.println(name + " "+pop);
			if(pop>maxPop) {
				maxNation = name;
				maxPop = pop;
			}
		}
		System.out.println("which country has the most population ? "+maxNation+", "+maxPop);
	}
}
