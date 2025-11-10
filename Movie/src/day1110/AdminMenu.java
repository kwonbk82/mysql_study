package day1110;

import java.io.IOException;
import java.util.ArrayList;

public class AdminMenu extends AbstractMenu {
	
	private static final AdminMenu instance = new AdminMenu(null,null);
	private static final String ADMIN_MENU_TEXT = "[관리자 메뉴]\n"
												+"1 : 영화 등록하기 \n"
												+"2 : 영화 목록보기 \n"
												+"3 : 영화 삭제하기 \n"	
												+"b : 종료 \n\n"
												+"메뉴를 선택하세요 >>";

	private AdminMenu(String menuText, Menu prevMenu) {
		super(ADMIN_MENU_TEXT, prevMenu);
		// TODO Auto-generated constructor stub
	}
	
	public static AdminMenu getInstance() {
		return instance;
	}
	@Override
	public Menu next() {
		switch(scan.nextLine()) {
		case "1" :
			createMovie();
			return this;
		case "2" :
			printMovies();
			return this;
		case "3" : 
			deleteMovie();
			return this;
		case "b" :
			return prevMenu;
		default:
			return this;
		}
	}
	
	private void deleteMovie() {
		// TODO Auto-generated method stub
		printMovies();
		System.out.println("삭제할 영화코드를 입력하세요 : ");
		
		try {
			Movie.delete(scan.nextLine());
			System.out.println(">> 삭제되었습니다");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(">> 삭제에 실패했습니다");

		}
	}

	private void createMovie() {
		// TODO Auto-generated method stub
		System.out.println("제목 : ");
		String title = scan.nextLine();
		
		System.out.println("장르 : ");
		String genre = scan.nextLine();
		
		Movie movie = new Movie(title,genre);
		try {
			movie.save();
			System.out.println(">> 등록되었습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(">> 등록 실패했습니다");

		}
	}

	private void printMovies() {
		try {
			ArrayList<Movie> movies =  Movie.findAll();
			System.out.println();
			for(int i=0;i<movies.size();i++) {
				System.out.printf("%s\n",movies.get(i));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("영화 목록 접근에 실패하셨습니다");
		}
	}
}
