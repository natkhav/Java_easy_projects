package regularExpressions;
import java.util.regex.*;


public class RegExpressionsDemo {

	public static void main(String[] args) {
		
		
		String pattern = "[a-z]+";
		String check = "Regular Expressions";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );
		
		// Find if there are any matches in a sentence 
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


	}

}
