package day1028;

import java.util.Scanner;

public class ObjectString5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string > ");
		String s = scan.nextLine();
		String[] arr1 = s.split(" ");
		for(String a : arr1) {
			System.out.println(a+", ");
		}
		System.out.println("모두 "+arr1.length+"개의 단어가 있습니다");
		
		String a = "a,b,c,d,e";
		String[] arr = a.split(",");
		System.out.println(arr[0]);
	}
}
