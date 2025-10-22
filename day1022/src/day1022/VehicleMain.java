package day1022;

public class VehicleMain {
	public static void main(String[] args) {
//		Car c = new Car(1234,10);
//		Plane p = new Plane("FC5321");
//		c.setSpeed(60);
//		p.setSpeed(600);
		Vehicle v1 = new Car(999,20);
		Vehicle v2 = new Plane("DH010");
		v1.setSpeed(60);
		v2.setSpeed(600);
		
		v1.show();
		v2.show();
		System.out.println("---------------하나의 참조변수로 다루기---------------");
		Vehicle v3 = null;
		v3 = new Car(4567,60);
		v3.setSpeed(100);
		v3.show();
		v3 = new Plane("FC0681");
		v3.setSpeed(400);
		v3.show();
		System.out.println("---------------객체배열--------------");
		Vehicle[] v4 = new Vehicle[2];
		v4[0]=new Car(8564,100);
		v4[0].setSpeed(50);
		v4[1]=new Plane("PC546");
		v4[1].setSpeed(500);

		for(Vehicle v : v4) {
			v.show();
			if(v instanceof Car) {
				System.out.println("이 객체는 Car");
			}else {
				System.out.println("이 객체는 Plane");
			}
		}
	}
}
