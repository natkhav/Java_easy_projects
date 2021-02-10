package queue;
import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		
		// Make an queue and add elements
		Queue<Integer> qu = new LinkedList<>();
		
		qu.add(1);
		qu.add(4);
		qu.add(55);
		qu.add(34);
		qu.add(96);
		qu.add(325);		
		
		// Display the elements of the queue
		System.out.println("Elements of the queue: " + qu);
		
		//Display size of the queue
		int size = qu.size();
		System.out.println("Size of the quue: " + size);
		
		
		// To view the head of the queue
		System.out.println("Head of the queue: " + qu.peek());
		
		//Iterate the queue
		Iterator iterator = qu.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// Remove the first element of the queue
		int rmvhead = qu.remove();
		System.out.println("\nRemoving the head ");
		System.out.println("Now head of the queue is: " + qu.peek());
		
		//Printing the head element and removing it
		System.out.println("\nPrinted head element " + qu.poll() + " and removed it");
		System.out.println("Now head of the queue is: " + qu.peek());
		
		//Adding an element
		boolean add = qu.offer(12);
		System.out.println("\nAdded new element");
		System.out.println("Now the queue is: " + qu);
		
		
		
	

	} // End of Main

} // End of Class
