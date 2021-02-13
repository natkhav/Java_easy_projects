package regularExpressions;
import java.util.regex.*;


public class RegExpressionsDemo {

	public static void main(String[] args) {
		
		System.out.println("\nExample #1: ");
		String pattern = "[a-z]+";
		String check = "Regular Expressions";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );
		
		// Find if there are any matches in a sentence 
		System.out.println("\nExample #2: ");
		System.out.println("\nChecking if there is a 'Lamb' in a 'Mary had a little lamb entance' ");
		Pattern pattern2 = Pattern.compile("Lamb", Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pattern2.matcher("Mary Had a little lamb");
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	    
		// Find if there are any matches in a sentence 
		System.out.println("\nChecking if there is a 'Cat' in a 'Mary had a little lamb entance' ");
		Pattern pattern3 = Pattern.compile("Cat", Pattern.CASE_INSENSITIVE);
	    Matcher match = pattern2.matcher("Mary Had a little lamb");
	    boolean found = matcher.find();
	    if(found) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	    
	    //More examples 
	    System.out.println("\nExample #3: ");
	    String s = "SHDYF1254U";
		if(s.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			System.out.println(s + "valid");
		}
		else {
			System.out.println(s + "invalid");
			
		}
		
		System.out.println("\nExample #4: ");
		String x="!@#1   ADFFSfjkdhsfk 231A$'2  L3";
		System.out.println(x.replaceAll("[^A-Za-z]", ""));
		System.out.println(x.replaceAll("[^A-Za-z]", "").length());
		System.out.println(x.replaceAll("[^a-z]", ""));
		System.out.println(x.replaceAll("[^0-9]", ""));
		System.out.println(x.replaceAll("[ 0-9A-Za-z]", ""));
		
		
		System.out.println("\nExample #5: ");
		String s1 = "+1-9087654329";
		if (s1.matches("\\+1-[0-9]{10}")) {
			System.out.println("Valid mobile number");
		} else {
			System.out.println("Invalid Mobile Number");
		}		


	}

}
