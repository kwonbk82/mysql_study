package day1022;

public class Action extends Movie{
	Action(String name){
		super(name);
	}
	public double discounted() {
		return price*(1-rate)-1000;
	}
}
