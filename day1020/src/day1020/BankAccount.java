package day1020;

public class BankAccount {
	private String account;
	private int balance;
	private double interestRate=0.02;
	
	public String getAccount() {
		return account;
	}
	public int getBalance() {
		return balance;
	}
	
	BankAccount(String account,int balance){
		this.account=account;
		this.balance=balance;
	}
	
	public void deposit(int amount) {
		this.balance += amount; 
	}
	public void withdraw(int amount) {
		this.balance -= amount; 

	}
	public void applyInterest() {
		balance += balance*interestRate;
	}
	public void applyInterest(double customRate) {
		balance += balance*interestRate;
	}
	public void print() {
		System.out.println(account+"의 잔액 :"+balance+"만원");
	}
}
