
public class CarMain1 {
	public static void main(String[] args) {
		FireEngine f = new FireEngine();
		
		System.out.println(f.color);
		System.out.println(f.door);
		f.drive();
		f.stop();
		f.water();
		
		System.out.println("-----------------------");
//		Car c = new FireEngine();
		Car c = (Car )f;
		System.out.println(c.color);
		System.out.println(c.door);
		c.drive();
		c.stop();
//		c.water();
		
		FireEngine f2 = (FireEngine) c;
		
		Car car = null;
		FireEngine fe1 = new FireEngine();
		FireEngine fe2 = null;
		
		car = fe1;
//		car.water();
		fe2 = (FireEngine) car;
		fe2.water();
	}
}
