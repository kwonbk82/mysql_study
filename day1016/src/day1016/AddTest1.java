package day1016;

public class AddTest1 {
	int add(int x,int y) {
		return x+y;
	}
	float add(float x,float y) {
		return x+y;
	}
	String add(String x,String y) {
		return x+y;
	}
	public static void main(String[] args) {
		AddTest1 at = new AddTest1();
		System.out.println(at.add(3,5));
		System.out.println(at.add(1.3f,5.2f));
		System.out.println(at.add("c","b"));
	}
}
