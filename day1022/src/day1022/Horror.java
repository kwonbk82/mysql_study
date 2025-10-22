package day1022;

public class Horror extends Movie{
	Horror(String name){
		super(name);
	}
	public double discounted() {
		return price*(1-rate)-800;
	}
}
