package day1016;

public class PhoneTest1 {
	public static void main(String[] args) {
		Phone p1 = new Phone();
//		p1.maker = "samsung";
//		p1.color = "yongdal blue";
//		p1.price = 1200000;
		
		Phone p2 = new Phone("apple","graphite",1400);
		
		System.out.printf("p1의 제조사 : %s, 색상 : %s, 가격 : %d원",p1.maker,p1.color,p1.price);
		System.out.printf("p2의 제조사 : %s, 색상 : %s, 가격 : $%d",p2.maker,p2.color,p2.price);
		
		//클래스명 : Flower.java
		//필드 : name, cost
		//메서드 : flowerInfo
		//FlowerMain.java
		//매개변수 2개짜리 생성자 호출
		//장미 한송이 가격은 1,500원입니다.
		//튤립 한송이 가격은 2,000원입니다.
	}
}
