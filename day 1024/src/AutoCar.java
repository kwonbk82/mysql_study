
public class AutoCar implements OperateCar{
	public void start() {
		System.out.println("go");
	};
	public void stop() {
		System.out.println("don't go");
	}
	public void setSpeed(int speed) {
		System.out.println("speed :"+speed+"km/h");
	}
	public void turn(int degree) {
		System.out.println(degree+"도");
	}
}
