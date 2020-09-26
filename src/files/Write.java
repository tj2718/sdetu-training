package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// Define the path that we want to write
		String fileName = "C:\\Users\\travis.KELNOREEM\\Documents\\Udemy\\Java\\JuniorSoftwareDeveloper\\JavaTraining\\fileToWrite.txt";
		String message = "I'm writing this data that will be placed in a file.";
		
		// Create the file in Java
		File file = new File(fileName);
				
				
		// Open the file
		try {
			FileWriter fw = new FileWriter(file);
			
			fw.write(message);
			fw.close();
			
		} catch (IOException e) {
			System.out.println("Error: Could not read file: " + fileName);
			e.printStackTrace();
		}
		finally {
			System.out.println("Closing filewriter...");
		}
		
		// Write to the file

		
		
		// Close the resources

	}

}
