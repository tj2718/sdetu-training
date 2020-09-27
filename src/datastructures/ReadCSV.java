package datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.List;

public class ReadCSV {

	public static void main(String[] args) {
		// This method will read data from a CSV file

		List<String[]> data = new ArrayList<String[]>();
		String filename = "C:\\Users\\travis.KELNOREEM\\Documents\\Udemy\\Java\\JuniorSoftwareDeveloper\\JavaTraining\\students.csv";
		String datarow;
		double balance = 0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filename));
			while ((datarow = br.readLine()) != null) {
				String[] line = datarow.split(",");
				data.add(line);
			}
			br.close();
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		for (String[] d : data) {
			System.out.println("[ ");
			for(String field : d) {
				System.out.print(field + " ");
			}
			System.out.println(" ]");
		}
		
		
		
		
	}

}
