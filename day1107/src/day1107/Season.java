package day1107;

public enum Season {
	SPRING("봄"),
	SUMMER("여름"),
	AUTUMN("가을"),
	WINTER("겨울"),
	
	private final String kName;
	Season(String kName) {
		// TODO Auto-generated constructor stub
		this.kName=kName;
	}
	public String getkName() {
		return kName;
	}
	
}
