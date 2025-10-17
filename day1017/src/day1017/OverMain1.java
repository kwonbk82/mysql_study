package day1017;

class A1{
	
		int num1;
		int num2;
		String print() {
		return "num1 :"+num1+"num2 : "+num2;

	}
}
class B1 extends A1{
	int num3;
	String print() {
		return "num1 :"+num1+"num2 : "+num2+"num3 : "+num3;
	}
}
public class OverMain1 {
	public static void main(String[] args) {
		B1 b = new B1();
		b.num1=10;
		b.num2=20;
		b.num3=30;
	}
}
