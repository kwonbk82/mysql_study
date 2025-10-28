package day1028;

public class ObjectString3 {
	public static void emailTest(String str) {
		int at = str.indexOf("@");
		int dot = str.indexOf(".");
		if(at>0 && dot>0 && dot>at) {
			System.out.println("valid");
		}else {
			System.out.println("invalid");
		}
	}
	public static void main(String[] args) {
		String email1="test@naver.com";
		String email2="testnaver.com";
		String email3="test@navercom";
		String email4="test.naver@com";
		
		emailTest(email1);
		emailTest(email2);
		emailTest(email3);
		emailTest(email4);
	}
}
