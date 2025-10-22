package day1022;

public abstract class Movie {
	int price=10000;
	double rate;
	String name;
	
	Movie(String name){
		this.name=name;
	}
	
	public abstract double discounted();
}
