package day0930;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("값 입력 > ");
//		int num = scan.nextInt();
//		System.out.println("입력내용 : "+num);
		
//		int num = scan.nextInt();
//		System.out.println("입력내용 : "+(num/10));
		
		int x=10,y=10,z=0;
		System.out.println("---------------------------------");
		x++;
		++x;
		System.out.println("x : "+x);
		System.out.println("---------------------------------");

		y--;
		--y;
		System.out.println("y : "+y);
		System.out.println("---------------------------------");

		z=++x;
		System.out.println("z : "+z);
		System.out.println("x : "+x);
		System.out.println("---------------------------------");
		
		z=x++;
		System.out.println("z : "+z);
		System.out.println("x : "+x);
		System.out.println("---------------------------------");

		z=++x + y++;
		System.out.println("z : "+z);
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		System.out.println("---------------------------------");


}
}
