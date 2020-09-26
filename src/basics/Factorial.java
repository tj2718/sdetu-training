package basics;

public class Factorial {

	public static void main(String[] args) {
		int[] a = {5, 7, 3, 10, 8};
		double[] b = {5, 7, 3, 10, 8};
		System.out.println(factorial(5));
		System.out.println(sum(5));
		System.out.println(min(a));
		System.out.println(max(a));
		System.out.println(avg(b));
	}

	static int factorial(int a) {
		int b = 1;
		if(a == 0 || a == 1) {
			return 1;
		}
		else
			for(int i = 2; i <= a; i++) {
				b = b * i;
			}
			return b;
	}
	
	static int sum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	static int min(int[] a) {
		int minimum = a[0];		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > minimum) {
			}
			else if (a[i] < minimum){
				minimum = a[i]; 
			}
		}
		return minimum;
	}
	
	static int max(int[] a) {
		int maximum = a[0];		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > maximum) {
				maximum = a[i];
			}
			else if (a[i] < maximum){
			}
		}
		return maximum;
	}
	
	static double avg(double[] b) {

		double sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum += b[i];
		}
		return sum / b.length; 
	}
	
	
}



