package day0930;

public class Overflow1 {
	public static void main(String[] args) {
		byte b =127;
		b=++b;
		System.out.println(-b);
		
		long a = 100000l*100000;
		System.out.println(a);
		
		char c1 = 'a';
		char c2 = (char)(c1+1);
		char c3 = ++c1;
		System.out.println(c3);
		
		int num1 = 'B'-'A';
		int num2 = '2';
		System.out.println(num2);

	}
}
