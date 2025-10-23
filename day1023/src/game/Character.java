package game;

public abstract class Character {
	int exp;
	int level=1;
	int hp;
	
	Character(int exp,int hp){
		this.exp=exp;
		this.hp=hp;
	}
	
	public abstract int potion();
	public abstract int heal();
	public abstract void lucid();
	public abstract void seren();
	public abstract void levelUp();
	public  void checkHp() {
		if(hp>0) {
			System.out.println("남은 체력 : "+hp);
		}else {
			System.out.println("사망하여 가까운 마을로 이동합니다");
		}
	};
}
