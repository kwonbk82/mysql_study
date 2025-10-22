package day1022;

public class PlayerMain {
	public static void main(String[] args) {
//		추상클래스는 객체생성이 안된다
		Youtube yt = new Youtube();
		yt.play("8jaywalking");
		yt.stop();
	}
}
