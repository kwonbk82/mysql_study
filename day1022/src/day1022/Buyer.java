package day1022;

import java.util.Arrays;

public class Buyer {
	int money = 10000;
	int bonusPoint = 0;
	int i=0;
	Product[] cart = new Product[10];
	
	void buy(Product d) {
		if(money<d.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		this.money -=d.price;
		this.bonusPoint +=d.bonusPoint;
		cart[i++]=d;
		System.out.println(Arrays.toString(cart));
		System.out.println(d+"구매완료");
	}
	void summury() {
		int sum=0;
		String itemList="";
		for(Product c : cart) {
			if(c==null) {
				break;
			}
			sum+=c.price;
			itemList+=c+", ";
		}
		System.out.println("총 금액 : "+sum+"만원");
		System.out.println("구매한 제품 : "+itemList);
	}
	
//	void buyTv(Tv t) {
//		if(this.money<t.price) {
//			System.out.println("잔액이 부족합니다.");
//			return;
//		}
//		this.money -=t.price;
//		this.bonusPoint +=t.bonusPoint;
//		System.out.println("tv를 구매하였습니다.");
//	}
//	void buyCom(Com c) {
//		if(this.money<c.price) {
//			System.out.println("잔액이 부족합니다.");
//			return;
//		}
//		this.money -=c.price;
//		this.bonusPoint +=c.bonusPoint;
//		System.out.println("computer를 구매하였습니다.");
//	}
//	void buyPhone(Phone p) {
//		if(this.money<p.price) {
//			System.out.println("잔액이 부족합니다.");
//			return;
//		}
//		this.money -=p.price;
//		this.bonusPoint +=p.bonusPoint;
//		System.out.println("phone를 구매하였습니다.");
//	}
}	
