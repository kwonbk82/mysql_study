package day1016;

public class Phone {
	String maker;
	String color;
	int price;
	
	Phone (){
		this("없음","없음",0);
	}
	
	Phone(String maker,String color, int price){
		this.maker = maker;
		this.color = color;
		this.price = price;
	}
}
