
public interface Remocon {
	final int max_volume=10;
	final int min_volume=0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
