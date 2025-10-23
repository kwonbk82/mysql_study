package game;

public class Aran extends Character{
	Aran(int exp,int hp){
		super(exp,hp);
	}
	public  int potion() {
		return hp+=10;
	};
	public  int heal() {
		return hp+=5;
	};
	public  void lucid() {
		this.exp+=5;
		this.hp-=20;
		System.out.println("exp : "+exp+", "+"hp : "+hp);
	};

	public  void seren() {
		this.exp+=20;
		this.hp-=15;
		System.out.println("exp : "+exp+", "+"hp : "+hp);

	};
	public  void levelUp() {
		if(exp>=40) {
			level++;
			exp=0;
			System.out.println("레벨업!!"+level);
		}
	};
	
}
