
public class RemoconMain {
	public static void main(String[] args) {
//		Television tv = new Television();
		Remocon rc=null;
		rc= new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(100);
		rc.setVolume(-1);
		rc.turnOff();
	}
	
}
