package datastructures;

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = {"a", "b", "c", "d", "e", "f"};
		
		for(int i = 0; i < alphabet.length; i++) {
			System.out.println(alphabet[i]);
		}

		for(String letter : alphabet) {
			System.out.println(letter);
		}
		
		String[][] users = {
				{"John", "Williams", "jw@test.com", "9095551212"},
				{"Sarah", "Jackson", "sj@test.com", "8585551212"},
				{"Rachael", "Wallace", "rw@test.com", "7605551212"}
				};				

		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("Number of users: " + numOfUsers);
		System.out.println("Number of fields: " + numOfFields);
		
		for(int a = 0; a < numOfUsers; a++) {
				String firstName = users[a][0];
				String lastName = users[a][1];
				String email = users[a][2];
				String phone = users[a][3];
				System.out.println(firstName + " " + lastName + " " + email + " " + phone);
				
		}

		for (String[] user : users) {
			for(String field : user) {
				System.out.print(field + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
