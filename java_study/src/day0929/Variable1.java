package day0929;

public class Variable1 {
	public static void main(String[] args) {
		byte x = 12;
		System.out.println(x);
		
		char ch = 'a';
		System.out.println(ch);
		
		String st = "";
		System.out.println(st);
		
		String str = "abx";
		System.out.println(str);
		
		int age = 30;
		System.out.println("나이 : "+ age);

		String name = "kbk";
		System.out.println("이름 : "+ name);

		String address = "M-academy";
		System.out.println(address);
		
		System.out.printf("이름 : %s, 나이 : %d, 주소: %s \n",name,age,address);
		
		int X = 12;
		int Y = 5;
		int Z = X;
		X=Y;
		Y=Z;
		System.out.println(X);
		System.out.println(Y);
		
		int num1 = 12134;
		int num2 = 555;
//		printf에서 %d 정수 %f 실수 %s 문자
		System.out.print(num2);
		System.out.printf("%d",num1);

		
	}
}
