package day1027;

public class CarException extends Exception{
	public CarException() {
		super("gas is less than 0");
	}
}
