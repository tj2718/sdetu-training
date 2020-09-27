package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		Set<String> animals = new LinkedHashSet();
		// LinkedHash order they were entered
		// HashSet complete random order
		// TreeSet rearranges to alphabetical/numerical
		// Sets are unique values/lists
		
		
		animals.add("dog");
		animals.add("pig");
		animals.add("hog");
		animals.add("cat");
		animals.add("snake");
		
//		System.out.println(animals);
		
		animals.add("goose");
		animals.add("hog");
		animals.add("cat");
		System.out.println(animals);
		
		
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("chicken");
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("dog");
		farmAnimals.add("horse");
		
		// Intersection of animals and farm animals AND
		Set<String> intersectionSet = new HashSet<String>(animals);
//		System.out.println(intersectionSet);
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The intersection is " + intersectionSet);
		
		// Union both animals and farm animals OR
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union is: " + unionSet);
		
		// Difference animals but not farm animals 1 and not the other
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The difference is " + differenceSet);
		
		
		
		
		
		
	}

}
