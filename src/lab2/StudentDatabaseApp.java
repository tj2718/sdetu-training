package lab2;

public class StudentDatabaseApp {

	public static void main(String[] args) {
	
		StudentDatabase sd1 = new StudentDatabase("Travis", "333224444");
		sd1.setPhone("9095551212");
		sd1.setCity("Dallas");
		sd1.setState("TX");
		
		
		System.out.println(sd1.toString());

	}

}
