package lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Passwords {

	public static void main(String[] args) {
		
		String fileName = "C:\\Users\\travis.KELNOREEM\\Documents\\Udemy\\Java\\JuniorSoftwareDeveloper\\JavaTraining\\passwords.txt";
		File file = new File(fileName);
		String password = null;
		String[] passwords = new String[13];

		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(int i = 0; i < passwords.length; i++) {
				password = br.readLine();

				try {
					if(!password.matches(".*\\d.*")) {
						throw new NumberException(password);
					}
					if(!password.matches(".*[a-z].*|.*[A-Z].*")) {
						throw new LetterException(password);
					}
					if(!password.matches(".*\\W.*")) {
						throw new SymbolException(password);
					}
				}
				catch(NumberException e) {
					System.out.println("Error: At least one number is required.");
					System.out.println(e.toString());
				}
				catch(LetterException e) {
					System.out.println("Error: At least one letter is required.");
					System.out.println(e.toString());
				}
				catch(SymbolException e) {
					System.out.println("Error: At least one symbol is required.");
					System.out.println(e.toString());
				}
			}

			br.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Error: File not found.");
			e.printStackTrace();
		}
		catch(IOException e) {
			System.out.println("Error: Could not read from file.");
			e.printStackTrace();
		}
	}
}
	
class NumberException extends Exception {
	String num;
	NumberException(String num){
		this.num = num;
	}
	public String toString() {
		return ("NumberException: " + num);
	}
}

class LetterException extends Exception {
	String letter;
	LetterException(String letter){
		this.letter = letter;
	}
	public String toString() {
		return ("LetterException: " + letter);
	}
}

class SymbolException extends Exception {
	String symbol;
	SymbolException(String symbol){
		this.symbol = symbol;
	}
	public String toString() {
		return ("SymbolException: " + symbol);
	}
}
	
