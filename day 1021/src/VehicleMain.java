
public class VehicleMain {
	public static void main(String[] args) {
	Vehicle v1 = new Vehicle("제네시스", "g80", 2022);
	Truck t1 = new Truck("기아", "봉고차", 2024, 1.5);
	
	System.out.println(v1.getInfo());
	System.out.println(t1.getInfo());
	System.out.println(v1.getInfo(true));
	System.out.println(t1.getInfo(true));
	System.out.println("차량 수 :"+ Vehicle.getCount());
	
}
}
