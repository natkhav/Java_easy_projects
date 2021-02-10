package sets;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Create Hash Set
		HashSet<String> hset = new HashSet<String>();
		
		//Adding elements to he set
		hset.add("January");
		hset.add("February");
		hset.add("April");
		hset.add("June");
		hset.add(null);
		hset.add("August");
		hset.add("January");// duplicate value will be ignored
		
		//Printing set
		System.out.println("Printing the set");
		System.out.println(hset);
		
		//Iterating the set
		System.out.println("\nSet in ascending order");
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
			
		//Adding the element
		hset.add("November");
		System.out.println("\nPrinting the set with added element");
		System.out.println(hset);
		
		//Removing elements
		hset.remove("August");
		System.out.println("\nPrinting the set with removed element 'August' ");
		System.out.println(hset);

	}

}
