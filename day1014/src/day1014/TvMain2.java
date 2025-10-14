package day1014;

public class TvMain2 {
	public static void main(String[] args) {
		TV[] tvArr1 = new TV[3];
		tvArr1[0] = new TV(); 
		tvArr1[1] = new TV(); 
		tvArr1[2] = new TV(); 
		
		TV[] tvArr2 = {new TV(),new TV(),new TV()};
		
		TV[] tvArr3 = new TV[100];
		for(int i =0; i<100; i++) {
			tvArr3[i] = new TV();
		}
	}
}
