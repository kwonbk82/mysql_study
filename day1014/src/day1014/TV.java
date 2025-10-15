package day1014;

public class TV {
	String color;
	boolean power;
	int channel;
	int volume;
	
	void power() {
		power = !power;
		System.out.println(power ? "켜짐" : "꺼짐");
	}
	void channelUp() {
		++channel;
		System.out.println("현재 채널 : "+channel);
	}
	void channelDown() {
		--channel;
		System.out.println("현재 채널 : "+channel);
	}
	void volumeUp() {
		++volume;
		System.out.println("현재 음량 : "+volume);
	}
	void volumeDown() {
		--volume;
		System.out.println("현재 음량 : "+volume);
	}
	void mute() {
		volume = 0;
		System.out.println("음소거");

	}
	void setChannel(int ch) {
		channel = ch;
	}
}
