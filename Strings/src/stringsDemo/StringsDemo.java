package stringsDemo;

import java.util.Arrays;

public class StringsDemo {

	public static void main(String[] args) {
		
			    // create strings
			    String s1 = "Red ";
			    String s2 = "Apples";
			    String s3 = "Lemon";
			    String s4 = "Lemon";
			    String s5 = new String("Lemon");
			    String str = "Mary had a little lamb";
			    String str2 = "!@#!  ADFFfrhsu 23145$'w L#";

			    // print all strings
			    System.out.println("My strings are: ");
			    System.out.println(s1);   // print Apples
			    System.out.println(s2);  // print Bananas
			    System.out.println(s3);   // print Lemon
			    System.out.println(s4);   // print Lemon
			    System.out.println(s5);   // print string object 
			    System.out.println(str); 
			    System.out.println(str2); //
			    
			    //str2 operations
			    System.out.println("\nOperations on string 'str2': ");
			    int alpha = 0, upper=0, lower=0,digit=0,alphanum=0, spaces=0, special=0;
			    for(int i =0; i<str2.length(); i++) {
			    	char ch = str2.charAt(i);
			    	if(Character.isAlphabetic(ch)) {
			    		alpha++;
			    	}
			    	if(Character.isUpperCase(ch)) {
			    		upper++;
			    	}
			    	if(Character.isLowerCase(ch)) {
			    		lower++;
			    	}
			    	if(Character.isDigit(ch)) {
			    		digit++;
			    	}
			    	if(Character.isAlphabetic(ch)) {
			    		alphanum++;
			    	}
			    	if(Character.isWhitespace(ch)) {
			    		spaces++;
			    	}
			    	if(!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
			    		special++;
			    	}
			    	
			    }
			    System.out.println(alpha);
			    System.out.println(upper);
			    System.out.println(lower);
			    System.out.println(digit);
			    System.out.println(alphanum);
			    System.out.println(spaces);
			    System.out.println(special);
			    
			    
			    //Join two strings
			    System.out.println("\nJoining strings 's1', 's2' : ");
			    String joined = s1.concat(s2);
			    System.out.println("\nJoined strings: " + joined);
			    
			    //Print length of a string 
			    System.out.println("\nString 'str' lenght: " + str);
			    System.out.println("It's length is: " + str.length());
			    String ar1[]=str.split("");
			    for (int i =0; i< ar1.length; i++) {
			    	System.out.println(ar1[i]);
			    }
			    
			    ////Comparing two strings- true
			    System.out.println("\nComparing strings : ");
			    System.out.println("Strings 's1' and 's2' are the same: " + (s1==s2));
			    System.out.println("Strings 's3' and 's4' are the same: " + (s3==s4));
			    System.out.println("Strings 's4' and 's5' are the same: " + (s4==s5));

			    //Comparing two strings- false
			    boolean result1 = s2.equals(s3);
			    System.out.println("\nStrings 's2' and 's3' are the same: " + result1);
			    
			  //Comparing two strings- true
			    boolean result2 = s3.equals(s4);
			    System.out.println("Strings 's3' and 's4' are the same: " + result2);
			    
			  //Comparing two strings- true
			    boolean result3 = s4.equals(s5);
			    System.out.println("Strings 'second' and 'third' are the same: " + result3);
			    
			    // Converting string to array and displaying index [0]
			    System.out.println("\nConverting string 's' to array and displaying index [0] ");
			    System.out.println("s1.charAt(0) :  " + s1.charAt(0));
			    char ar[]=s1.toCharArray();
			    System.out.println(Arrays.toString(ar));
			    
			    
			    //Removing elements from string
			    System.out.println("\nRemoving elements from string '3' ");
			    System.out.println(""+ s3.substring(1));
			    System.out.println(""+ s3.substring(1,4));
			    
			    //Trimming white space off
			    System.out.println("\nTrimming white space off in string '   hello  ' ");
			    String s6 = "    hello ";
			    System.out.println("Initial string: "+ s6);
			    s6 =s6.trim();
			    System.out.println("Updated string: "+ s6);
			    

	}

}
