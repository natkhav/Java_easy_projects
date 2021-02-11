package mapDemo;
import java.util.*;
public class TreeMapDemo {
	
	public static void main(String[]args) {
		
		
		// Create treemap 
		Map<Integer, String> tm = new TreeMap();
		
		// Add keys and values
		
		tm.put(100, "London");
		tm.put(104, "Paris");
		tm.put(452, "Moscow");
		tm.put(871, "Amsterdam");
		tm.put(102, null);
		tm.put(562, "London");
		
		// Print initial lhm
				System.out.println("Initial lhm: " + tm);
				System.out.println("\nLhm size: " + tm.size());
				
				// Print value specified by the key
				System.out.println("\nThe value for key '100' is: " + tm.get(100));
				
				// Check if the key exists
				System.out.println("\nChecking if the key '452' exists: "+ tm.containsKey(452));
				
				//Check if value exists
				System.out.println("\nChecking if the value 'Moscow' exists: "+ tm.containsValue("Moscow"));
				
				// Printing all keys
				System.out.println("\nPrinting all keys: "+ tm.keySet());
				
				// Printing all values
				System.out.println("\nPrinting all values: "+ tm.values());
				
				// Iterating using keys
				Set<Integer> set = tm.keySet();
				System.out.println("\nIterating using keys ");
				for(Integer i :set) {
					System.out.println("key is: " + i + " value is " + tm.get(i));	
				}
				
				// remove key
				tm.remove(102);
				System.out.println("\nlhm after removing key '102' : " + tm);
				
				// Add key 
				tm.put(854, "Wasington DC");
				System.out.println("\nlhm after adding key '854' : " + tm);
	}
	


}
