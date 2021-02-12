package stringsDemo;

public class StringsDemo {

	public static void main(String[] args) {
		
			    // create strings
			    String first = "Red ";
			    String second = "Apples";
			    String third = "Lemon";
			    String fourth = "Lemon";
			    String str = "Mary had a little lamb";

			    // print strings
			    System.out.println("First, second and third strings are: ");
			    System.out.println(first);   // print Apples
			    System.out.println(second);  // print Bananas
			    System.out.println(third);   // print Lemon
			    System.out.println(fourth);   // print Lemon
			    
			    //Join two strings
			    String joined = first.concat(second);
			    System.out.println("\nJoined strings: " + joined);
			    
			    //Print length of a string 
			    System.out.println("\nNew string: " + str);
			    System.out.println("It's length is: " + str.length());
			    
			    
			    //Comparing two strings- false
			    boolean result1 = second.equals(third);
			    System.out.println("Strings 'second' and 'third' are the same: " + result1);
			    
			  //Comparing two strings- true
			    boolean result2 = third.equals(fourth);
			    System.out.println("Strings 'second' and 'third' are the same: " + result2);


	}

}
