package day1027;

public class ThrowsExam1 {
	public static void main(String[] args) {
		method1();
	}
	static void method1() throws Exception{
		try{
			method2();
		}catch(Exception e) {
			System.out.println("method1에서 예외 처리함");
			throw e;
		}
	}
	static void method2() throws Exception {
		throw new Exception();
	}
	
//	try{
//		throw new Exception();
//	}catch(Exception e) {
//		아무것도 없으면 예외가 숨겨짐
//	}
}
