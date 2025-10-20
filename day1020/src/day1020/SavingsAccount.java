package day1020;

public class SavingsAccount extends BankAccount{
	int minBalance;
	
	SavingsAccount(String account,int balance,int minBalance){
		super(account, balance);
		this.minBalance=minBalance;
	}
	
	public void withdraw(int amount) {
		if (getBalance()-amount >=minBalance) {
			super.withdraw(amount);;
		}else {
			System.out.println("잔액이 부족합니다");
		}
	}
	public int getMinBalance() {
		return minBalance;
	}
}
