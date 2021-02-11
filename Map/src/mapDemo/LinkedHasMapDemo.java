package mapDemo;
import java.util.*;
public class LinkedHasMapDemo {

	public static void main(String[] args) {


		//Create the map
		Map<Integer, String> lhm = new LinkedHashMap<>();
		
		// Add keys and values
		lhm.put(100, "London");
		lhm.put(104, "Paris");
		lhm.put(452, "Moscow");
		lhm.put(871, "Amsterdam");
		lhm.put(102, null);
		lhm.put(562, "London");
		
		// Print initial lhm
		System.out.println("Initial lhm: " + lhm);
		System.out.println("\nLhm size: " + lhm.size());
		
		// Print value specified by the key
		System.out.println("\nThe value for key '100' is: " + lhm.get(100));
		
		// Check if the key exists
		System.out.println("\nChecking if the key '452' exists: "+ lhm.containsKey(452));
		
		//Check if value exists
		System.out.println("\nChecking if the value 'Moscow' exists: "+ lhm.containsValue("Moscow"));
		
		// Printing all keys
		System.out.println("\nPrinting all keys: "+ lhm.keySet());
		
		// Printing all values
		System.out.println("\nPrinting all values: "+ lhm.values());
		
		// Iterating using keys
		Set<Integer> set = lhm.keySet();
		System.out.println("\nIterating using keys ");
		for(Integer i :set) {
			System.out.println("key is: " + i + " value is " + lhm.get(i));	
		}
		
		// remove key
		lhm.remove(102);
		System.out.println("\nlhm after removing key '102' : " + lhm);
		
		// Add key 
		lhm.put(854, "Wasington DC");
		System.out.println("\nlhm after adding key '854' : " + lhm);
		

	} // End of Main

} // End of Class
