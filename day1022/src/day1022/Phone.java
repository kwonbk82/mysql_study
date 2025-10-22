package day1022;

public class Phone extends Product{
	
	Phone(){
		super(500);
	}
	double getBonesRate() {
		return 0.05;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Phone";
	}
}
