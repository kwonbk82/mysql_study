package day1022;

public class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price=price;
		bonusPoint = (int)(price*getBonesRate());
	}
	double getBonesRate() {
		return 0;
	}
}
