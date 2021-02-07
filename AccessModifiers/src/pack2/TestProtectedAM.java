/* This is a test class that accesses 
 * class ProtectedAM
 */
package pack2;
import pack1.*;

public class TestProtectedAM extends ProtectedAM{ // Initializing class TestProtecedAM as a subclass of ProtectedAM
	
	public static void main(String[]args) { 
		TestProtectedAM object = new TestProtectedAM(); // creating an object of the TestProtectedAM class
		object.display(); // calling display function 
	}
	

}
