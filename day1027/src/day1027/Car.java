package day1027;

public class Car {
	private int num;
	private double gas;
	
	public Car() {
		num=0;
		gas=0;
		System.out.println("new car");
	}
	public void setCar(int num,double gas) {
		if(gas<0) {
//			throw new CarException(gas);
		}else {
			this.num=num;
			this.gas=gas;
			System.out.println("number : "+num);
			System.out.println("gallon : "+gas);
		}
	
	}
	public void show() {
		System.out.println("number : "+num);
		System.out.println("gallon : "+gas);
	}
}
