/*This is an example of the class with
 *protected access modifier. It will be accessed 
 *by public class"TestProtectedAM" located in the different package.
 */
package pack1;

public class ProtectedAM {
	
	protected void display() { // protected display method to be called from TestProtectedAM class
		System.out.println(" 'ProtectedAM' was accessed using Protected Access Modifiers");
	}

}
