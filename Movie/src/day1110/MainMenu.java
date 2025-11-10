package day1110;

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
	private boolean checkAdminPw() {
		System.out.println("관리자 비밀번호를 입력하세요 : ");
		
		String pw = scan.nextLine();
		return "admin1234".equals(pw);
		
		
	}
}
