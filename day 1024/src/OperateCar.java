
public interface OperateCar {
	public static final int SPEED=60;
//	인터페이스에서는 abstract 생략 가능
	void start();
	void stop();
	void setSpeed(int speed);
	void turn (int degree);
	
	default void fly() {
		System.out.println("I can fly");
	}
	static void print(String msg) {
		System.out.println(msg+"출력");
	}
//	private 메서드는 다른 메서드에서 호출해서 사용!!
}
