package day1104;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;


public class TreeExam2 {
	public static void main(String[] args) {
		TreeMap<Integer,String> map = new TreeMap<>();
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter country and population >> ");
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+". nation info > ");
			String con = scan.next();
		int num = scan.nextInt();
		map.put(num, con);

		
		Map.Entry<Integer,String> big = map.lastEntry();
		System.out.println("which country has the most population ? "+big.getKey()+", "+big.getValue());
		}
		
		
	}
}
