package day0930;

import java.util.Scanner;

public class OperatorExam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요 : ");

		int num = scan.nextInt();
		String grade = (num>=90) ? "A" : ((num>=80) ? "B" : "C");
		System.out.println("결과 : "+grade);
		
		scan.nextLine();
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		


		System.out.print("주소 : ");
		String address = scan.nextLine();
		
		System.out.print(name+"님은"+address+"에 삽니다.");


		
		
	}

}
