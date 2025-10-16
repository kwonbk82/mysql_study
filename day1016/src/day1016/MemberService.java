package day1016;

public class MemberService {
//	String login (String id,String pw) {
//		if(id=="green" && pw=="1234") {
//			System.out.println("그린님 안녕하세요!");
//		}else {
//			System.out.println("회원정보가 틀립니다 꺼지세요");
//		}
//	}
	boolean check(String id,String pw) {
		boolean result = false;
		if(id.equals("green") && pw.equals("1234")) {
			result = true;
		}
		return result;
	}
	boolean check(String id) {
		boolean result = false;
		if(id.equals("green")) {
			result = true;
		}
		return result;
	}
	
}
