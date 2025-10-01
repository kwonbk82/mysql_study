package day1001;

import java.util.Scanner;

public class SwitchExam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int time = (int)(Math.random()*5)+8;
		System.out.println("출근시간 : "+time+"시");
		String str="";
		switch(time) {
		case 8 :
			str+="출근을 합니다";
		case 9 :
			str+="회의를 합니다";
//			break;
		case 10 :
			str+="외근을 합니다";
		default :
			str+="업무를 합니다";
		}
		System.out.println(str);
	}
}
