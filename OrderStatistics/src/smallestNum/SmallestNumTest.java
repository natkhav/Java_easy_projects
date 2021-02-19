package smallestNum;

public class SmallestNumTest {
	public static void main(String[] args) {
		
		SmallestNum ob = new SmallestNum(); 
        int arr[] = {12, 3, 443, 8, 4, 19, 43}; 
        int n = arr.length,k = 4; 
        System.out.println("The smallest element is "+ ob.smallestNum(arr, 0, n-1, k)); 
    }


}
