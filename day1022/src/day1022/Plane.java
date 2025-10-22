package day1022;

public class Plane extends Vehicle{
	String flight;
	
	Plane(String flight){
		this.flight=flight;

	}
	void show() {
		System.out.println("편명 : "+flight);
		System.out.println("속도 : "+speed);
	};
}
