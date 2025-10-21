
public class Truck extends Vehicle {
	private double ton;
	
	Truck(String make,String model,int year, double ton){
		super(make, model,year);
		this.ton=ton;

	}
	
	String getInfo(boolean detailed) {
		if(detailed) {
			return super.getInfo(true)+"적재량 : "+ton+"톤";
		}else {
			return getInfo();
		}
		
	}
}
