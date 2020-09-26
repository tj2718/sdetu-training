package lab2;

import java.util.Random;

public class StudentDatabase {

	private String name;
	private String ssn;
	private String emailId;
	private static int iD = 1000;
	private String userId;
	private String phone;
	private String city;
	private String state;
	private double balance;
	
	Random rand = new Random();
	
	StudentDatabase(String name, String ssn) {
		this.emailId = name + "@email.com";
		iD++;
		this.userId = iD + "" + (rand.nextInt(1000) * 9) + ssn.substring(5, 9);
		
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	public void enroll() {
		
	
	}
	
	public double checkBalance() {
		return balance;
		
	}
	
	@Override
	public String toString() {
		return "UserID: " + userId;
		
	}
	
	public void showCourses() {
		
		
	}	

}
