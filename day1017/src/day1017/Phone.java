package day1017;

public class Phone {
	String name;
	int cost;
	
	Phone(){}
	public Phone(String name,int cost) {
		this.name=name;
		this.cost=cost;
	}
	void phoneInfo() {
		System.out.printf("%s의 가격은 %d원",name,cost);
	}
	
}
