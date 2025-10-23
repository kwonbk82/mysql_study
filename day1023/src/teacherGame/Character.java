package teacherGame;

public abstract class Character {
	protected int hp;
	protected int level=1;
	protected int energy;
	
	public abstract void eat();
	public abstract void sleep();
	public abstract void play();
	public abstract void practice();
	public abstract void levelUp();
	public  boolean checkEnergy() {
		if(energy<=0) {
			return true;
		}else {
			return false;
		}
	};
}
