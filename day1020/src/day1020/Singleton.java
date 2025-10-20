package day1020;

public class Singleton {
	private int x;
	private int y;
	private static Singleton s = new Singleton();
	private Singleton() {
		x=1;
		y=2;
	}
	public static Singleton getInstance() {
		return s;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y=y;
	}
}
