package day1016;

public class CarS {
	int num;
	double gas;
	static int sum;
	
	void setCarS(int n, double g) {
		num = n;
		gas = g;
		sum++;
		
		System.out.println("new car is ready");
		}
	void showCar() {
		System.out.printf("차량번호는 %d입니다",num);
		System.out.println("연료량은"+gas+"입니다");
	}
	
	static void showSum() {
		System.out.println("생산량"+sum+"대");
	}
	
	
}
