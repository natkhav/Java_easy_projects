package arraysDemo;

public class MultArraysDemo {

	public static void main(String[] args) {
		
		//Create 2-dimensional array
		int[][] a = {
	            {1, 2, 3}, 
	            {4, 5, 6, 9}, 
	            {7}, 
	        };
	      
	        // Calculate the length of each row
	        System.out.println("Length of row 1: " + a[0].length);
	        System.out.println("Length of row 2: " + a[1].length);
	        System.out.println("Length of row 3: " + a[2].length);
	        
	        // Print elements of all arrays
	        for (int i = 0; i < a.length; ++i) {
	            for(int j = 0; j < a[i].length; ++j) {
	                System.out.println(a[i][j]);
	            }
	        }
	  }

}
