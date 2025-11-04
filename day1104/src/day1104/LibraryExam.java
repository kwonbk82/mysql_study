package day1104;

import java.util.Scanner;
import java.util.Set;

public class LibraryExam {
	public static void main(String[] args) {
		BookMain bm = new BookMain();
		
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			System.out.println("---도서관리 프로그램---");
			System.out.println("1. 도서 추가");
			System.out.println("2. 도서 검색");
			System.out.println("3. 전체 도서 목록");
			System.out.println("4. 도서 가격 수정");
			System.out.println("5. 도서 삭제");
			System.out.println("6. 프로그램 종료");
			System.out.println("_____________________");
			System.out.println("select menu >> ");
			
			int choice = Integer.parseInt(scan.nextLine());
			switch(choice) {
			case 1:
				bm.addBook();
				break;
			case 2:
				bm.searchBook();
				break;
			case 3:
				bm.listBook();
				break;
			case 4:
				bm.updateBook();				
				break;
			case 5:
				bm.removeBook();
				break;
			case 6:
				System.out.println("Quit program");
				flag = false;
				break;
//				return;
			}	
		}

		
	}
}
