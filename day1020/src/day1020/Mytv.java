package day1020;

public class Mytv {
	private boolean isPowerOn;
	private int channel;
	private int prevChannel;
	private int volume;
	
	public boolean getPowerOn() {
		return isPowerOn;
		
	}
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
		if(this.isPowerOn) {
			System.out.println("켜짐");
		}else {
			System.out.println("꺼짐");
		}
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel>MIN_CHANNEL || channel<=MAX_CHANNEL) {
			return;
		}else {
			prevChannel=this.channel;
			this.channel = channel;	
		}

	}
	public void gotoPrevChannel() {
		setChannel(prevChannel); 
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume>MIN_VOLUME || volume<=MAX_VOLUME) {
			return;
		}else {
			this.volume = volume;
			}
		
	}
	
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 1;
}
