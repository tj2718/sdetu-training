package Algorithms;


public class Demo {

	public static void main(String[] args) {
		int[] numbers = {10, 25, 433, 26, 73, 132, 5, 35};
		int[] sortedNumbers = {5, 9, 12, 18, 21, 26, 29, 35, 39, 45, 49, 51, 58, 59, 61, 72, 88, 91, 94};
		
		// Linear search
		int pos = Algorithms.Search.linearSearch(numbers, 73);
		System.out.println("Found at position: " + pos);
		
		// Calls binary search
		int index = Algorithms.Search.binarySearch(sortedNumbers, 59, 0, sortedNumbers.length - 1);
		System.out.println("Found at position: " + index);

		Sort.bubbleSort(numbers);
		
		
	}

}
