package lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// This will read a text file and retrieve a phone number
		// Valid phone number : 10 digits long
		// There is no 911
		// Area code doesn't start with zero
		
		String fileName = "C:\\Users\\travis.KELNOREEM\\Documents\\Udemy\\Java\\JuniorSoftwareDeveloper\\JavaTraining\\PhoneNumber.txt";
		File file = new File(fileName);
		String phoneNum = null;
		String[] phoneNums = new String[3];
		

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(int j = 0; j < phoneNums.length; j++) {
				phoneNum = br.readLine();
				System.out.println(phoneNum);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Could not read file.");
			e.printStackTrace();
		}
	

		for(int i = 0; i < phoneNums.length; i++) {
			phoneNum = phoneNums[i];
			try {
				if(phoneNum.length() != 10) {
//					throw new TenDigitsException(phoneNum);
				}
				if((phoneNum.substring(0, 1).equals("0")) || (phoneNum.substring(0, 1).equals("9"))) {
					throw new AreaCodeException(phoneNum);
				}
				for(int n = 0; n < phoneNum.length() - 2; n++) {
					if(phoneNum.substring(n, (n + 1)).equals("9")) {
						if(phoneNum.substring(n + 1, n + 3).equals("11")) {
							throw new EmergencyException(phoneNum);
						}
					}
				}				
			}
			catch(TenDigitsException e) {
				System.out.println("Error: Phone number is not 10 digits.");
				System.out.println(e.toString());
			}
			catch(AreaCodeException e) {
				System.out.println("Error: Area code cannot begin with 0 or 9.");
				System.out.println(e.toString());
			}
			catch(EmergencyException e) {
				System.out.println("Error: Emergency 911 string detected");
				System.out.println(e.toString());
			}
		}		
	}

	


	class TenDigitsException extends Exception {
		String num;
		TenDigitsException(String num){
			this.num = num;
		}
		public String toString() {
			return ("TenDigitsException: " + num);
		}
	}
	
	class AreaCodeException extends Exception {
		String num;
		AreaCodeException(String num){
			this.num = num;
		}
		public String toString() {
			return ("AreaCodeException: " + num);
		}
	}
	
	class EmergencyException extends Exception {
		String num;
		EmergencyException(String num){
		this.num = num;
		}
		public String toString() {
			return ("EmergencyException: " + num);
		}
	}
}
