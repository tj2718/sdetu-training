package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "0168549";
		
		BankAccount acc2 = new BankAccount("checking");
		
		
		BankAccount acc3 = new BankAccount("savings", 100);
		System.out.println(acc3.routingNumber);
	}

}
