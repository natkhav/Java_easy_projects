package lists;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Create Array LIst
		ArrayList<String> alist = new ArrayList<String>(); 
		
		//Add elements
		alist.add("Cat");
		alist.add("Dog");
		alist.add("Fish");
		alist.add("Bird");
		alist.add("Elephant");
		
		// Print the list
		System.out.println("Printing a list");
		System.out.println(alist);
		
		// Iterating the list using while loop
		System.out.println("\nPrinting iterated list using 'while loop'");
		Iterator itr = alist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Iterating the list using For-each loop
		System.out.println("\nPrinting iterated list using 'for-each loop'");
		for(String animals : alist) {
			System.out.println(animals);
		}
		
		// Sorting the list a-z
		System.out.println("\nSorting the list");
		Collections.sort(alist);
		for(String animals : alist) {
			System.out.println(animals);
		}
		
		
		// Adding an element to specific position
		System.out.println("\nAdding the element to index position 1");
		alist.add(1, "Bear");
		System.out.println(alist);
		
		// Adding an element to the end
		System.out.println("\nAdding the element to the end of the array");
		alist.add("Tiger");
		System.out.println(alist);
		
		//Removing elements by index
		System.out.println("\nRemoving elements by index (3)");
		alist.remove(3);
		System.out.println(alist);
		
		//Removing elements by object
		System.out.println("\nRemoving elements by object");
		alist.remove("Tiger");
		System.out.println(alist);

	}

}
