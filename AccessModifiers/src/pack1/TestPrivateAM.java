/*This is a test class that 
 * will try to call private method 
 * in PrivateAM class
 */

package pack1;

public class TestPrivateAM {

	public static void main(String[] args) {
		
		System.out.println("The private method 'display' can be accessed only from it's own class.");
		PrivateAM object = new PrivateAM(); // creating an object of the PrivateAM class 
		//in order to call the private display method.
		// object.display(); 

	}

}
