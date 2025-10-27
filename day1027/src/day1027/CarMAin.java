package day1027;

public class CarMAin {
	public static void main(String[] args) {
		Car car = new Car();
		try {
			car.setCar(1234,-1);
		}catch(CarException e) {
			System.out.println(e+"exception occurred");
		}
		car.show();
	}
}
