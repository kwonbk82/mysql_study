package day1027;

public class Exception2 {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0] : "+data1);
			System.out.println("args[1] : "+data2);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
		}
		
		try {
			String data3 = "100";
			String data4 = "gg0";
			int value1 = Integer.parseInt(data3);
			int value2 = Integer.parseInt(data4);
			int result = value1 + value2;
			int result2 = value1/value2;
			System.out.println(result);
			System.out.println(result2);
		}catch(NumberFormatException | ArithmeticException e){
			System.out.println(e.getMessage());
		} 
		
	}
}
