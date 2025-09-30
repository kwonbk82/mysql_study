package day0930;

public class OperatorExam2 {
	public static void main(String[] args) {
		int num = 456;
		System.out.println(num/100*100);
		System.out.println(num-(num % 100));
		
		int apples = 123;
		int basket = 10;
		int result = apples/basket + (apples % basket>0 ?1 : 0);
		System.out.println("필요한 바구니 수 : "+result+"개");
		System.out.println("---------------------------------");
		
		
		
		int F = 100;
		float C = 5*(F-32)/9f;
		double RC = (int)(C*100+0.5);
		System.out.println(RC/100);

		System.out.println("섭씨 : "+RC/100+"도");


	}
}
