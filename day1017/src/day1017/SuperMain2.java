package day1017;

class Parent2{
	int x =10;
}
class Child2{
	int x =20;
	
	void method() {
		System.out.println("x :"+x);
		System.out.println("parent.x :"+x);
		
	}
}
public class SuperMain2 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method();
	}
}
