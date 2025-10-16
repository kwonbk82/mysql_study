package day1016;

public class Constractor {
	int x;
	Constractor() {
		this(1000);
		x=10;
		System.out.println("매개변수가 없는 생성자");
		System.out.println("x : "+this.x);
	}
	Constractor(int x) {
		this.x=x;
		System.out.println("매개변수가 하나인 생성자");
		System.out.println("x : "+this.x);

	}
	public static void main(String[] args) {
		Constractor c = new Constractor();
		
	}
}
