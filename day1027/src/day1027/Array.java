package day1027;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		int num;
		int arr[];
		Scanner s = new Scanner(System.in);
		System.out.println("enter your number > ");
		num = s.nextInt();
		
		if(num<5) {
			try {
				throw new MyException();
			}catch(MyException e) {
				e.printStackTrace();
			}
		}else {
			arr = new int[num];
			System.out.println("배열이 생성되었습니다");
		}
		
	}
	
}
