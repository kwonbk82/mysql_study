package day0929;

import java.util.Scanner;

public class ArrayExam8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0;
		int y = 0;
		final int SIZE = 10;
		char [][] ship = new char [SIZE][SIZE];
		int[][] board = 
			{
				{0,0,1,0,0,0,0,0,0},
				{0,1,0,0,0,0,0,0,0},
				{1,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,1,0,0},
				{0,0,0,0,0,1,0,0,0},
				{0,0,0,0,1,0,0,1,0},
				{0,0,0,0,0,0,1,0,0},
				{0,0,0,1,0,0,0,0,0},
				{0,0,0,0,1,0,0,0,0},
				{0,0,0,0,1,0,0,0,0}
				};
		for(int i = 1; i<SIZE; i++) {
			board[0][i] = (char) i + '0';
			board[i][0] = (char) i + '0';
		}
		while(true) {
			System.out.println("좌표를 입력하세요(종료는 00) > ");
			String input = scan.nextLine();
			if(input.length()==2) {
				x= input.charAt(0)-'0';
				y= input.charAt(1)-'0';
				
				if(x==0 && y==0) {
					break;
				}
				if(x<=10) {
					System.out.println("잘못된 입력입니다");
					continue;
				}
				System.out.println(x);
				System.out.println(y);
				
				if(board[x-1][y-1]==1) {
					board[x][y]='O';
				}else {
					board[x][y]='X';
				}
				for(int i=0;i<SIZE;i++) {
					System.out.println(ship[i]);
				}
			}
		}
	}
}
