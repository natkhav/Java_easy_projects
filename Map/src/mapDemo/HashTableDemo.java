package mapDemo;

import java.util.*;
import java.util.Map.Entry;


public class HashTableDemo {

	public static void main(String[] args) {
		
		// Create treemap 
		Map<Integer, String> ht = new Hashtable<>();
		
		// Add keys and values
		
		ht.put(100, "London");
		ht.put(104, "Paris");
		ht.put(452, "Moscow");
		ht.put(871, "Amsterdam");
		ht.put(102, "Chicago");
		ht.put(562, "London");
		
		// Print initial lhm
				System.out.println("Initial ht: " + ht);
				System.out.println("\nht size: " + ht.size());
				
				// Print value specified by the key
				System.out.println("\nThe value for key '100' is: " + ht.get(100));
				
				// Check if the key exists
				System.out.println("\nChecking if the key '452' exists: "+ ht.containsKey(452));
				
				//Check if value exists
				System.out.println("\nChecking if the value 'Moscow' exists: "+ ht.containsValue("Moscow"));
				
				// Printing all keys
				System.out.println("\nPrinting all keys: "+ ht.keySet());
				
				// Printing all values
				System.out.println("\nPrinting all values: "+ ht.values());
				
				// Iterating using keys
				Set<Integer> set = ht.keySet();
				System.out.println("\nIterating using keys ");
				for(Integer i :set) {
					System.out.println("Key: " + i + " value: " + ht.get(i));	
				}
				
				// Iterate using entrySet
				System.out.println("\nIterating using entrySet()");
				for(Entry<Integer, String> e:ht.entrySet()) {
					System.out.println("Key: "+e.getKey()+" value: " + e.getValue());
				}
				
				// remove key
				ht.remove(102);
				System.out.println("\nht after removing key '102' : " + ht);
				
				// Add key 
				ht.put(854, "Wasington DC");
				System.out.println("\nht after adding key '854' : " + ht);

	} //End of Main

}// End of Class
