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
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			phoneNum = br.readLine();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Could not read file.");
			e.printStackTrace();
		}
		
		System.out.println(phoneNum);
	}

}
