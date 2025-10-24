
public class SmartTv implements Remocon,Searchable {
	private int v;
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
			this.v=Remocon.min_volume;
		}			
		System.out.println(v);
	}
	public void search(String name) {
		System.out.println(name+"을 검색합니다");
	}
	public static void main(String[] args) {
		SmartTv st = new SmartTv();
		st.turnOn();
		st.search("youtube");
		st.setVolume(9);
		
		Remocon rc = st;
		
	}
}
