package day1022;

public class Car extends Vehicle{
	int num;
	int gas;
	Car(int num, int gas){
		this.num=num;
		this.gas=gas;
		
	}
	
	void show() {
		System.out.println("차량번호 : "+num);
		System.out.println("연료량 : "+gas);
		System.out.println("속도 : "+speed);
	};
	
}
