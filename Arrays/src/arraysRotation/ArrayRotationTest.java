package arraysRotation;

public class ArrayRotationTest {
	
	public static void main(String[] args) {
		
		ArrayRotation r = new ArrayRotation();
	    		int arr[] = { 10, 42, 83, 47, 15, 6, 97 }; 
	    		
	    		r.rotate(arr, 5); 
	    		
	    		for(int i=0;i<arr.length;i++){
	        			System.out.print(arr[i]+" ");
	    		}
	
	}

}


