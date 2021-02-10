package lists;
import java.util.*;
public class LinkedListsDemo {

	public static void main(String[] args) {
		
		//Create Linked List
		LinkedList<String> lList =new LinkedList<String>();
		
		//Add elements to the list
		lList.add("Apple");
		lList.add("Banana");
		lList.add("Pineapple");
		lList.add("Lemon");
		lList.add("Orange");
		lList.add("Apple");
		
		//Print list
		System.out.println("Printing the list");
		System.out.println(lList);
		
		//Adding element by index
		lList.add(4, "Lemon");
		System.out.println("\nPrinting the list with new element");
		System.out.println(lList);
		
		//Adding element to first and last positions
		lList.addFirst("Papaya");
		lList.addLast("Pear");
		System.out.println("\nPrinting the list with new elements");
		System.out.println(lList);

		//Iterate the list ascending
		System.out.println("\nPrinting itereted list");
		Iterator<String> itr = lList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//Iterate list in reverse order
		System.out.println("\nPrinting itereted list in reverse order");
		Iterator<String> reverse = lList.descendingIterator();
		while(reverse.hasNext()) {
			System.out.println(reverse.next());
		}
		
		// Removing elements by index
		lList.remove(4);
		System.out.println("\nPrinting the list with removed element in index 4");
		System.out.println(lList);
		
		//Removing element by object
		lList.remove("Papaya");
		System.out.println("\nPrinting the list with removed element by object 'Papaya'");
		System.out.println(lList);
		
		// Printing particular position
		System.out.println("\nPosition of element with indx 3: " +  lList.get(3));
		
		//Ascending Sorting
		Collections.sort(lList);
		System.out.println("\nAscending sorting: " + lList);
		
		// Descending sorting
		Collections.sort(lList, Collections.reverseOrder());
		System.out.println("\nDescending sorting: " + lList);
			
		

	}//End of Main

}//End of Class
