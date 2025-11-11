package day1110;

import java.io.IOException;
import java.util.ArrayList;

public class MainMenu extends AbstractMenu {
	
	private static final MainMenu instance = new MainMenu(null,null);
	
	private static final String MAIN_MENU_TEXT = "1 : 영화 예매하기 \n"
												+"2 : 예매 확인하기 \n"
												+"3 : 예매 취소하기 \n"	
												+"4 : 관리자 메뉴로 \n"
												+"q : 종료 \n\n"
												+"메뉴를 선택하세요 >>";
//	싱글톤
	private MainMenu(String menuText, Menu prevMenu) {
		super(MAIN_MENU_TEXT, prevMenu);
		// TODO Auto-generated constructor stub
	}
//	싱글톤 객체를 외부로 반환 = 캡슐화
	public static MainMenu getInstance() {
		return instance;
	}
	
	
	@Override
	public Menu next() {
		switch(scan.nextLine()) {
		case"1":
			reserve();
			return this;
		case"2":
			checkReservation();
			return this;
		case"3":
			cancelReservation();
			return this;
		case"4":
			if(!checkAdminPw()) {
				System.out.println("비밀번호가 다릅니다");
				return this;
			}
			
			AdminMenu adminMenu = AdminMenu.getInstance();
			adminMenu.setPrevMenu(this);
			
			return adminMenu;
			
		case "q" :
			return prevMenu;
		default:
			return this;
		}
	}
	
	private void reserve() {
		// TODO Auto-generated method stub
		try {
			ArrayList<Movie> movies = Movie.findAll();
			for(int i=0;i<movies.size();i++) {
				System.out.printf("%s \n",movies.get(i));
			}
			System.out.println("예매할 영화를 선택하세요 >>");
			String movieIdStr = scan.nextLine();
			Movie m = Movie.findById(movieIdStr);
			
			ArrayList<Reservation> reservations = Reservation.findByMovieId();
			Seats seats = new Seats(reservations);
			System.out.println("좌석을 선택하세요 (예:E1) : ");
			String seatName = scan.nextLine().toUpperCase();
			
			Reservation r = new Reservation(Long.valueOf(movieIdStr),m.getTitle(),seatName);
			
			r.save();
			System.out.printf("예매가 완료되었습니다 >> 예매번호 :%d \n",r.getId());


		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("파일입출력에 문제가 생겼습니다");
		}catch(Exception e) {
			System.out.println(">> 예매에 실패하였습니다 :" +e.getMessage());
		}
	}
	private void cancelReservation() {
		// TODO Auto-generated method stub
		System.out.println("예매번호를 입력하세요 > ");
		Reservation canceled;
		try {
			canceled = Reservation.cancel(scan.nextLine());
			if(canceled != null) {
				System.out.printf(">> [취소완료] %s의 예매가 취소되었습니다. \n",canceled);
			}else {
				System.out.println(">> 예매내역이 없습니다.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private void checkReservation() {
		System.out.println("예매번호를 입력하세요 > ");
		Reservation r;
		try {
			r = Reservation.findById(scan.nextLine());
			if(r != null) {
				System.out.printf(">> [확인완료] %s \n",r);
			}else {
				System.out.println(">> 예매내역이 없습니다.");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	private boolean checkAdminPw() {
		System.out.println("관리자 비밀번호를 입력하세요 : ");
		
		String pw = scan.nextLine();
		return "admin1234".equals(pw);
		
		
	}
}
