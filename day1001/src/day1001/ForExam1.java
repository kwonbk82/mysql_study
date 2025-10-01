package day1001;

import java.util.Scanner;

public class ForExam1 {
	public static void main(String[] args) {
		
		for(int i = 1,j=10;i<=10; i+=2,j--) {
			System.out.println(i+","+j);
			}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 > ");
		int num = scan.nextInt();
		int eSum=0, oSum=0,tSum=0;
		for(int i= 1;i<=num;i++) {
			if(i%2==0) {
				eSum +=i;
			}else {
				oSum +=i;
			}
			tSum +=i;
			}
		
		System.out.println("짝수합계 : "+eSum);
		System.out.println("홀수합계 : "+oSum);
		System.out.println("총합계 : "+tSum);
	}
}
