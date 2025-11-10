package day1110;

public class MainApp {
	public static void main(String[] args) {
		System.out.println("start program");
		
		Menu menu = MainMenu.getInstance();
		while(menu !=null) {
			menu.print();
			menu=menu.next();
		}
		System.out.println("exit program");
	}
}
