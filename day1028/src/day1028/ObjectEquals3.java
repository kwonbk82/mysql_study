package day1028;

import java.util.Scanner;

public class ObjectEquals3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id= "test";
		String pw = "1234";
		System.out.println("id : ");
		String idStr = scan.nextLine();
		System.out.println("pw : ");
		String pwStr = scan.nextLine();
		
		if(id.equals(idStr)&&pw.equals(pwStr)) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("틀렸습니다");
		}
	}
}
