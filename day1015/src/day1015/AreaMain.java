package day1015;

import java.util.Scanner;

public class AreaMain {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("가로 길이 > ");
		int x=scan.nextInt();
		System.out.println("세로 길이 > ");
		int y=scan.nextInt();
		AreaCalculator yard = new AreaCalculator();
		int myun = yard.area(x, y);
		System.out.printf("가로길이가 %d이고 세로 길이가 %d인 직사각형의 면적은 %d입니다.",x,y,myun);
	}
}
