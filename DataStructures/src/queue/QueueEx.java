package queue;
import java.util.*;

public class QueueEx {
	
	public static void main(String[] args) {
		
	       Queue<String> locationsQueue = new LinkedList<>();
	       
	       locationsQueue.add("Apple");
	       locationsQueue.add("Banana");
	       locationsQueue.add("Orange");
	       locationsQueue.add("Lemon");
	       locationsQueue.add("Pinapple");
	       
	       System.out.println("Queue is : " + locationsQueue);
	       System.out.println("Head of Queue : " + locationsQueue.peek());
	       locationsQueue.remove();
	       System.out.println("After removing Head of Queue : " + locationsQueue);
	       System.out.println("Size of Queue : " + locationsQueue.size());
	       
	 }
}
