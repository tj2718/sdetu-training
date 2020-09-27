package lab2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreditCards {

	public static void main(String[] args) {
		List<String[]> data = new ArrayList<String[]>();
		String filename = "C:\\Users\\travis.KELNOREEM\\Documents\\Udemy\\Java\\JuniorSoftwareDeveloper\\JavaTraining\\creditcard.csv";
		String dataRow;
		double balance = 0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));

			while((dataRow = br.readLine()) != null) {
				String[] line = dataRow.split(",");
				data.add(line);
			}
			br.close();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for(String[] d : data) {
			if(d[1].contentEquals("CREDIT")) {
				balance += Double.parseDouble(d[3]);
			}
			else if(d[1].contentEquals("DEBIT")) {
				balance -= Double.parseDouble(d[3]);
			}
			else if(d[1].contentEquals("FEE")) {
				balance += Double.parseDouble(d[3]);
			}			
		}
		
		if(balance > 0) {
			balance *= 1.1;
			System.out.println("You have been assesed a 10% charge.  New balance is : " + balance);
		}
		else if(balance == 0) {
			System.out.println("Thank you for your payment.");
		}
		else {
			System.out.println("Thank you for your payment.  You have overpaid by " + (balance * -1));
		}
	}
}
