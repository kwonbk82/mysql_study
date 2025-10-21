
public class Vehicle {
	private String make;
	private String model;
	private int year;
	
	private static int vehicleCount;
	
	Vehicle(){
		
	}
	Vehicle(String make,String model,int year){
		this.make=make;
		this.model=model;
		this.year=year;
		
		vehicleCount++;
	}
	String getInfo() {
		return "Vehicle: "+make+", "+model;
	}
	String getInfo(boolean detailed) {
		if(detailed) {
			return "상세정보 : "+make+", "+model+", "+year+"년식";
		}else {
			return getInfo();
		}
	}
	public static int getCount() {
		return vehicleCount;
	}
}
