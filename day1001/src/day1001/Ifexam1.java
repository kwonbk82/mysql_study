package day1001;

import java.util.Scanner;

public class Ifexam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("영문자를 입력해주세요 > ");
		
		String word = scan.next();
		
		char c = word.charAt(0);
		if(c>=65 && c<=90) {
			System.out.println(word.toLowerCase());
		} else if (c>=97 && c<=122) {
			System.out.println(word.toUpperCase());
		} else {
			System.out.println("data error");
		}
		
		int dice = (int)(Math.random()*6)+1;
		System.out.println(dice);
		
		System.out.println("---------------------------------");
		
		
		System.out.print("점수를 입력해주세요 > ");
		int score = scan.nextInt();
		
		if(score>=90 && score<=100) {
			System.out.println("A");
		} else if (score>=80) {
			System.out.println("B");
		}else if (score>=70) {
			System.out.println("C");
		}else if (score>=60) {
			System.out.println("D");
		}else if (score>100) {
			System.out.println("S");
		}else {
			System.out.println("F");
		}
		
		System.out.println("---------------------------------");

	}
}
