/*This is an example of the class with
 *private access modifier. It will not be accessed 
 *by public class"TestPrivateAM" located in the same package.
 */
package pack1;

class PrivateAM {
	
	private void display() { // declaring private method
		System.out.println(" Nope, can't access ");
	}

}
