package day1022;

public class Tv extends Product{
	
	Tv(){
		super(1000);
		
	}
	double getBonesRate() {
		return 0.1;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tv";
	}
}
