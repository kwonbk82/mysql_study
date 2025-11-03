package day1103;

import java.util.HashMap;
import java.util.Scanner;

public class MapEXam5 {
	public static void main(String[] args) {
		HashMap<String,String> dic = new HashMap<>();
		
		dic.put("apple", "애플");
		dic.put("messi", "goat");
		dic.put("faker", "T1");
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("put in english word (enter exit to quit)> ");
			String eng = scan.nextLine();
			if(eng.equals("exit")) {
				System.out.println("exit program");
				break;
			}
			String kor = dic.get(eng);
			if(kor==null) {
			System.out.println(eng+"is not exist");
			
			}else {
				System.out.println("--->"+kor);
			}
		}
	}
}
