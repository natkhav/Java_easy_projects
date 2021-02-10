package sets;
import java.util.*;
public class LinkedHSDemo {

	public static void main(String[] args) {
		
		//Create HashSet set
		LinkedHashSet<String> lhs = new LinkedHashSet();
		
		//Add elements
		lhs.add("Toyota");
		lhs.add("Mazda");
		lhs.add("Ford");
		lhs.add("Honda");
		
		//Print the list
		System.out.println("Printing the list");
		int x = lhs.size();
		System.out.println(lhs);
		System.out.println("The list size is: " + x);
		
		
		//Iterating the list
		System.out.println("\nPrinting iterated list");
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Removing elements for list
		System.out.println("\nPrinting list with removed element");
		lhs.remove("Ford");
		int y = lhs.size();
		System.out.println(lhs);
		System.out.println("The list size now is: " + y);

		

	}

}
