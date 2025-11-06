package day1106;

public class BankAccount {
	private String username;
	private String number;
	private int amount;
	
	public BankAccount(String username,String number,int amount) {
		this.username=username;
		this.number=number;
		this.amount=amount;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s,%s,%d", username,number,amount);
	}
}
