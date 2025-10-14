package day1014;

public class TvMain1 {
	public static void main(String[] args) {
		TV samsung;
		samsung = new TV();
		
		TV apple = new TV();
		
		samsung.color = "black";
		samsung.channel = 55;
		samsung.volume = 10;
		samsung.power = false;
		
		apple.color = "gray";
		apple.channel = 1557;
		apple.volume = 5;
		apple.power = true;
		
		samsung.power();
		samsung.channelUp();
		samsung.volumeDown();
		samsung.mute();
		System.out.println("_______________________________");
		apple.power();
		apple.channelDown();
		apple.volumeUp();
		
		TV t3 = new TV();
		TV t4 = new TV();
		t4=t3;
		t3.channel = 3;
	}
}
