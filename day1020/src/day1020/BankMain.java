package day1020;

public class BankMain {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount("123-456", 1000);
		b1.deposit(500);
		b1.withdraw(200);
		b1.print();
	}
}
