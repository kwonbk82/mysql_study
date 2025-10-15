package day1015;

public class Recuresive2 {
	public static void main(String[] args) {
		
	}
	static long factorial(int n) {
		long result = 0;
		if(n==1) {
			return 1;
		}else {
			result = n*factorial(n-1);
		}
		return result;
	}
}
