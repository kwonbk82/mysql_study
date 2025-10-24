
public class Television implements Remocon{
	int v;
	public void turnOn() {
		System.out.println("turn on the TV");
	}
	public void turnOff() {
		System.out.println("turn off the TV");
	}
	public void setVolume(int v) {
		if(v>Remocon.max_volume) {
			this.v=Remocon.max_volume;
		}else if(v<Remocon.min_volume) {
			v=Remocon.min_volume;
		}			
		System.out.println(v);
	}
}
