package day1110;

import java.util.Scanner;

public abstract class AbstractMenu implements Menu {
	protected String menuText;
	protected Menu prevMenu;
	
	protected static final  Scanner scan = new Scanner(System.in);
	
	public AbstractMenu(String menuText,Menu prevMenu) {
		this.menuText=menuText;
		this.prevMenu=prevMenu;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("\n"+menuText);
	}
	
	public void setPrevMenu(Menu prevMenu) {
		this.prevMenu=prevMenu;
	}
}
