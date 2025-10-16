package day1016;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		MemberService ms = new MemberService();
		
		System.out.println("아이디를 입력하세요 > ");
		String id = scan.nextLine();
		System.out.println("비밀번호를 입력하세요 > ");
		String pw = scan.nextLine();
		
		boolean result = ms.check(id,pw);
		
		if(result) {
			System.out.println("그린님 반갑습니다!");
		}else {
			System.out.println("회원정보가 올바르지 않습니다");
		}
		
	}
}
