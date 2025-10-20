package day1020;

public class SingletonMain {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1.x : "+s1.getX());
		System.out.println("s2.x : "+s2.getX());
		
		s1.setX(100);
		System.out.println("s1.x : "+s1.getX());
		System.out.println("s2.x : "+s2.getX());
	}

}
