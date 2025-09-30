package day0930;

public class Type1 {
	public static void main(String[] args) {
		byte byteVar = 10;
		int intVar = byteVar;
		
		int intVar2 = 300;
		byte byteVar2 = (byte)intVar2;
		System.out.println(byteVar2);
		
		int intVar3 = 44032;
		char charVar3 = (char) intVar3;
		System.out.println(charVar3);
		
		double dVar4 = 3.14;
		int intVar4 = (int) dVar4;
		System.out.println(intVar4);
		
		byte b1 = 10;
		byte b2 = 20;
		
		int b3 = b1+b2;
		
		char c1 = 'A';
		char c2 = 1;
//		연산 사용시 int로 변환
		char c3 = (char)(c1+c2);
		System.out.println(c3);
		
		int x=1,y=2;
		double result =  (double) x/y;
		System.out.println(result);

		float d5 = 1.2f+3.4f;
		
		String str = 1+2+"";
		System.out.println(str);


	}
}
