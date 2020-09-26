package oop;

public class BankAccount {

	String accountNumber;
	String accountType;
	
	// Static belongs to the Class not the object instance
	// final is constant (often static final)
	static final String routingNumber = "077185963";
	String name;
	String ssn;
	
	// Constructor definitions:
	// 1. Used to define or setup or initialize properties of an object
	// 2. Constructors are implicitly called upon instantiation
	// 3. The same name as the class itself
	// 4. Constructors have NO return type
	
	
	BankAccount(){
		System.out.println("New account created.");
	}
	
	// Overloading: calling same method name with different arguments
	BankAccount(String accountType){
		System.out.println("New Account: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("New account: " + accountType + " with initial deposit of " + initDeposit);
		if (initDeposit < 1000) {
			String errorMsg = "Error: Minimum deposit must be greater than 1000.";
		}
	}
	
	// Define methods
	void deposit() {
	

	}
	
	void withdrawl() {
		
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}
	
	

}
