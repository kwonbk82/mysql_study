package day1001;

import java.util.Scanner;

public class ForExam2 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요 > ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num%2==0) {
			System.out.println("홀수를 입력하세요 > ");
		}
		
		int mid= num/2;
		
		for(int i = 0;i<num; i++) {
			for(int j = 0;j<num;j++) {
//				다이아몬드의 왼쪽공백과 오른쪽공백 확인용
				if(i<=mid) {
					if(j<mid-i||j>mid+i) {
						System.out.print(" ");
					}else {
						System.out.print("*");

					}
				}else {
					if(j<i-mid||j>num-(i-mid)-1) {
						System.out.print(" ");
					}else {
						System.out.print("*");
					}
				}
//				System.out.println("*");
				}
			}
	}
}
