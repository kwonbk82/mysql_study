package day1104;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BookMain {
	Set<Book> books = new HashSet<>();
	Scanner scan = new Scanner(System.in);
//	1
	public void addBook() {
		System.out.println("제목 : ");
		String title = scan.next();
		System.out.println("작가 : ");

		String author = scan.next();
		System.out.println("가격 : ");

		int price = Integer.parseInt(scan.nextLine());
		
		Book book = new Book(title,author,price);
		books.add(book);
		System.out.println(title+"책이 추가되었습니다.");
	}
//	2
	public void searchBook() {
		scan.nextLine();
		System.out.println("책 제목 입력 >> ");
		String title = scan.nextLine();
		
		
		for(Book b :books) {
			if(b.getTitle().equals(title)) {
				System.out.println(b.toString());
				break;
			}else {
				System.out.println("I can't find this book");
			}
		}
	}
//	3
	public void listBook() {
		if(books.size()==0) {
			System.out.println("there is no book");
			return;
		}
		for(Book b :books) {
			System.out.println(b);
		}
	}
//	4
	public void updateBook() {
		System.out.println("수정할 책 제목 : ");
		String title = scan.nextLine();
		boolean found = false;
		for(Book b :books) {
			if(b.getTitle().equals(title)) {
				System.out.println("수정할 가격 : ");
				int price = Integer.parseInt(scan.nextLine());
				b.setPrice(price);
				System.out.println("정보가 변경되었습니다");
				found=true;
				break;
			}
		}
	}
	
//	5
	public void removeBook() {
		System.out.println("삭제할 책 제목 : ");
		String title = scan.nextLine();
		for(Book b :books) {
			if(b.getTitle().equals(title)) {
				books.remove(b);
				System.out.println("삭제되었습니다");
				break;
			}else {
				System.out.println("I can't find this book");
			}
		}
	}
	
}
