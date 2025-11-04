package day1104;

import java.util.Scanner;

public class StuManager {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StudentMain sm = new StudentMain(scan);
		while(true) {
			String choice = scan.nextLine();
		switch(choice) {
		case "1":
			sm.addStu();
			break;
		case "2":
			sm.searchStu();
			break;
		case "3":
			sm.listStu();
			break;
		case "4":
			System.out.println("Quit program");
			return;
		}	
		}
	}
}
