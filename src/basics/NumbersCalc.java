package basics;

public class NumbersCalc {

	static void printName() {
		System.out.println("My name is Travis");
	}
	
	static void addNumbers(int a, int b) {
		System.out.println("The sum of numbers " + a + " and " + b + " is " + a + b);
	}
	
	static int multiplyNumbers(int a, int b) {
		int product = a * b;
		return product;
	}
	
	
	public static void main(String[] args) {
		System.out.println("Program is starting...");
		printName();
		
		int numA = 10;
		int numB = 20;
		int sum = numA + numB;
		addNumbers(numA, numB);
		multiplyNumbers(numA, numB);

	}

}
