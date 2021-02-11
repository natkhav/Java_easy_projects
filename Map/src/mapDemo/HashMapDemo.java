package mapDemo;
import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		
		// Create a map and add keys and values
		Map<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Jenifer");
		hm.put(2, "Chris");
		hm.put(3, "Mary");
		hm.put(4, "Ron");
		hm.put(5, "Harry");
		
		//Print the map
		System.out.println("Initial map: " + hm);
		
		//Print HashMap size
		System.out.println("\nHashMap size: ");
		System.out.println(hm.size());
		
		//Accessing an element by key
		System.out.println("\nID number 4 belongs to: ");
		System.out.println(hm.get(4));
		
		//Checking if key is present and has a value
		if(hm.containsKey(5)) {
			String a = hm.get(5);
			System.out.println("\nValue for key " + " \"5\" is: " + a );
		}
		
		//Loop through HM using keys
		System.out.println("\nLoop through HM to print only keys");
		for(Integer i : hm.keySet()) {
			System.out.println(i);
		}
		
		//Loop through HM using values
		System.out.println("\nLoop through HM to print only values");
		for(String str : hm.values()) {
			System.out.println(str);
		}
		
		// Delete element
		System.out.println("\nDeleting elemement 'two'" + hm.remove(3));
		System.out.println("Updated hashmap: " + hm);
		
		// Adding element
		hm.put(6, "Jphn");
		System.out.println("Updated hashmap: " + hm);
		
	}

}
