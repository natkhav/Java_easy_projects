package sets;
import java.util.*;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		//Creating the set and adding elements
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		ts.add(34);
		ts.add(524);
		ts.add(89);
		ts.add(43);
		ts.add(785);
		
		//Print the set
		System.out.println("Initial set: " + ts);
		System.out.println("Reverse set: " + ts.descendingSet());
		System.out.println("The highest value is: " + ts.pollFirst());
		System.out.println("The lowest value is: " + ts.pollLast());
		
		
		//Adding element to set
		ts.add(11);
		ts.add(8);
		System.out.println("\nUpdated set: " + ts);
		
		// Iterating the set
		System.out.println("\nIterated set in ascending order");
		Iterator<Integer> itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Reverse order
		System.out.println("\nIterated set in descending order");
		Iterator<Integer> rv = ts.descendingIterator();
		while(rv.hasNext()) {
			System.out.println(rv.next());
		}
		
	}

}
