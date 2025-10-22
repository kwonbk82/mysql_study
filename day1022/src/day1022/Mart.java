package day1022;

public class Mart {
	public static void main(String[] args) {
		Buyer b= new Buyer();
		
		Tv t = new Tv();
		Com c = new Com();
		Phone p = new Phone();
		
		b.buy(t);
		b.buy(c);
		b.buy(p);
		b.summury();
		
		
		System.out.println("잔액 :" + b.money);
		System.out.println("보너스 포인트 : "+b.bonusPoint);
	}
}
