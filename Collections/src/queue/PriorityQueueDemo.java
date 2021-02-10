package queue;
import java.util.*;
public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		// Create the queue and add new elements
		Queue<String> pq = new PriorityQueue();
		
		pq.add("Apples");
		pq.add("Bananas");
		pq.add("Pinapple");
		pq.add("Oranges");
		pq.add("Papaya");
		
		// Print initial queue
		System.out.println("Initial queue: " + pq);
		
		//Iterate the queue
		System.out.println("Iterated queue: ");
		Iterator it = pq.iterator(); 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// Printing head of the queue
		System.out.println("\nHead element: " + pq.peek());
		
		//Printing head element and removing it
		System.out.println("Printing head element " + pq.poll() + " and removing it");
		System.out.println("\nNow head element is: " + pq.peek());
		
		// Adding the element
		pq.offer("Kiwi");
		System.out.println("Added new element: " + pq);
	
	}// End of Main 

}//End of Class
