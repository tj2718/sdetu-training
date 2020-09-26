package exceptionsfiles;

public class NegativePaymentException extends Exception{
	// Define class variable
	double payment;
	// Constructor takes value that would throw the exception
	// Assign value of local variable class variable 
	public NegativePaymentException(double payment) {
		this.payment = payment;
	}
	// Override the toString() method to include the specific exception message
	public String toString() {
		return "Error: Cannot take negative payment of " + payment;
	}
	
}
