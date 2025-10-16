package day1016;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		int result1 = c.areaRectangle(10);
		int result2 = c.areaRectangle(10,20);
		System.out.println(result1+","+result2);
	}
}
