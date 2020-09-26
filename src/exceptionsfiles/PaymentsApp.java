package exceptionsfiles;

import java.util.Scanner;

public class PaymentsApp {

	public static void main(String[] args) {
		
		boolean positivePayment = true;
		double payment = 0;
		// Ask user for input

		
		
		do {
			System.out.print("Enter the payment amount: ");
			// Get the amount and test the value
			Scanner scanner = new Scanner(System.in);
			try {
				payment = scanner.nextDouble();
				scanner.nextLine();
				if (payment < 0) {
					throw new NegativePaymentException(payment);
				}
				else {
					positivePayment = true;
				}
	//		System.out.println(payment);
			}
			catch(NegativePaymentException e) {
				System.out.println(e.toString());
				System.out.println("Please enter again.");
				positivePayment = false;
			}
		}
		while(!positivePayment);
		
		
		System.out.println("Thank you for your payment of $" + payment);
		// Handle exceptions appropriately
		// Print confirmation

	}

}
