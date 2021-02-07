/*This is an example of the class with
 *public access modifier. It will be accessed 
 *by public class"TestPublicAM" located in the different package.
 */

package pack1;

public class PublicAM {
	public void display() { // void display method to be called from TestPublicAS class
		System.out.println(" 'PublicAS' was accessed using Public Access Modifiers");
	}

}
