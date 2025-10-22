package day1022;

public class Comedy extends Movie{
	Comedy(String name){
		super(name);
	}
	public double discounted() {
		return price*(1-rate)-1500;
	}
}
