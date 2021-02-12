/* In this program user can 
 * search a string entered 
 * by a user from the array of strings.
 */

package emailValidation;
import java.util.*;


public class EmailValidation {

	public static void main(String[] args) {
		
		
		//Create an arrayList with student IDs
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		// Add elements to initial arrayList
		arr.add(3458);
		arr.add(4657);
		arr.add(3467);
		arr.add(2456);
		arr.add(2647);
		
		// Uncomment to check initial array 
		//System.out.println(arr);
		
		// Prompt 1 asks users to enter their ID
		System.out.println("\nPrompt 1 asks users to enter their ID");
		System.out.println("---------------------------------------");
		
		//Initiate first scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your ID : ");
		while(input.hasNextInt()) {
			arr.add(input.nextInt());
			System.out.println("Your ID was entered");
			// Uncomment to check an array after insertion 
			//System.out.println(arr);
			break;
		}
		
		// Prompt 2 offers users to check if ID exists
		System.out.println("\nPrompt 2 offers users to check if ID exists");
		System.out.println("-------------------------------------------------");
			
		//Declare string variable
		String str = " ";
		do {
			Scanner option = new Scanner(System.in);
				System.out.println("\nEnter your ID: ");
				int num1 = input.nextInt();
				
					if(arr.contains(num1)) {
						System.out.println("\nYour ID exists");
					}else {
						System.out.println("\nID doesn't exist");
					}	
				System.out.println("\nDo you want check another ID? (yes/no) ");
				str = option.next();
				
		} while(str.equalsIgnoreCase("yes"));
		
		System.out.println("Exited the program");
	
	} // End of Main		
}// End of Class



