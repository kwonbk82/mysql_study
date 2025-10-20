package day1020;

public class MytvMain1 {
	public static void main(String[] args) {
		Mytv samsung = new Mytv();
		samsung.setChannel(5);
		
		samsung.setPowerOn(false);
		
		System.out.println(samsung.getChannel()+"번");
		samsung.setChannel(15);
		System.out.println(samsung.getChannel()+"번");
		samsung.gotoPrevChannel();
		}
	
}
