package day1106;

public class NormalProcess1 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		for(int i=0;i<300;i++) {
			System.out.println("-");
		}
		long endTime = System.currentTimeMillis();
		System.out.println("소요시간 : "+(endTime-startTime)+"ms");
	}
	 
}	
