package datastructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// Implement map interfaces
		
		TreeMap<Integer, String> hMap = new TreeMap<Integer, String>();
		mapUtil(hMap);

	}
	
	public static void mapUtil(Map<Integer, String> map) {
		// Add key-value pairs
		map.put(101, "Steve");
		map.put(502, "Roger");
		map.put(22, "Jennifer");
		map.put(315, "Mika");
		map.put(750, "Kelly");
		
		// Expose access elements
		System.out.println("See all the keys: " + map.keySet());
		System.out.println("See all key-value pairs: " + map);
		System.out.println(map.get(502));
		
		
		// Iterate through a map of key-value pairs
		for(int key : map.keySet()) {
			System.out.println("Key: " + key + " Value" + map.get(key));
		}
		
		
	}
	
	
	
}
