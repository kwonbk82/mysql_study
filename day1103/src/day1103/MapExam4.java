package day1103;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExam4 {
	public static void main(String[] args) {

		Map<String,String> map = new HashMap<>();
		
		map.put("spring", "12343");
		map.put("summer", "2343");
		map.put("autumn", "1343");
		map.put("winter", "1235");
		
		map.put("summer", "12345");

		
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("enter your ID >> ");
		String id = scan.nextLine();
		System.out.println("enter your PW >> ");
		String pw = scan.nextLine();
		
		if(map.containsKey(id)) {
			if(map.get(id).equals(pw)) {
			System.out.println("login successed");
			break;
			}else {
			System.out.println("login failed");
			}
		}else {
			System.out.println("wrong ID");
		}
		}
			
		}
	}

