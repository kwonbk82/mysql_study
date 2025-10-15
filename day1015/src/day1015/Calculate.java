package day1015;

public class Calculate {
	long add(long a,long b) {
		long result = a+b;
		if(a>10L) {
			return result;
		}else if(a<10L) {
			return 0;
		}else{
			return 1;
		}
	}
	long subtract(long a,long b) {
		long result = a-b;
		return result;
	}
	long multiply(long a,long b) {
		long result = a*b;
		return result;
	}
	long divide(long a,long b) {
		long result = a/b;
		return result;
	}
}
