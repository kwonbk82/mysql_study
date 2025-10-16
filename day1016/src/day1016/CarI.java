package day1016;

public class CarI {
	int num;
	double gas;
	
	void setCarI(int n, double g) {
		num = n;
		gas = g;
		}
	void showI() {
		System.out.printf("차량번호는 %d입니다",num);
		System.out.println("연료량은"+gas+"입니다");
	}
}
