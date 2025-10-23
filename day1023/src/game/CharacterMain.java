package game;

public class CharacterMain {
	public static void main(String[] args) {
		Aran a = new Aran(30, 50);
		System.out.println("현재 HP :"+a.potion());
		System.out.println("현재 HP :"+a.heal());
		a.lucid();
		a.levelUp();
		a.lucid();
		a.lucid();

		a.lucid();
		a.checkHp();
		a.seren();
		a.seren();

		a.seren();

	}
}
