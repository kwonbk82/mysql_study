package day1014;

public class TvMain3 {
	public static void main(String[] args) {
		TV[] tvArr = new TV[3];
		for(int i =0; i<tvArr.length; i++) {
			tvArr[i] = new TV();
			tvArr[i].channel = i+10;
			tvArr[i].volumeUp();
			System.out.printf("tvArr[%d].channel=%d",i,tvArr[i].channel,tvArr[i].volume);
		}
	}
}
