package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// Define the file (path) that we want to read.
		String fileName = "C:\\Users\\travis.KELNOREEM\\Documents\\Udemy\\Java\\JuniorSoftwareDeveloper\\JavaTraining\\fileToRead.txt";
		String text = "";
		// Create the file in Java
		File file = new File(fileName);
		
		// Open the file
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			
			text = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error: File not found " + fileName);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error: Could not read the data "  + fileName);
			e.printStackTrace();
		}
		finally {
			System.out.println("Finished reading the file");
			
		}
		
		System.out.println(text);
		// Read the file

		// Close the resources

	}

}
