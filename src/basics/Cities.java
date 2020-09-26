package basics;

public class Cities {

	public static void main(String[] args) {
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"};
		
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		System.out.println(states[0]);
		
		String[] countries;
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Mexico";
		countries[2] = "Canada";
		
		for(String state : states) {
			System.out.println(state);
		}
	}

}
