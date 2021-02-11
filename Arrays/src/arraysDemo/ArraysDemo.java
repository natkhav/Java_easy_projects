package arraysDemo;
import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		
		//Initialize an array 
		int arr[]= {12,33,12,12,33,44,5,5,324};
		
		//Print first element (index 0)
		System.out.println("ar[0] = "+arr[0]);

		
		//Iterating an array
		System.out.println("\nPrinting all array elements");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Index[" +i+ "] : " + arr[i]);
		}
		
		//Print even elements
		System.out.println("\nPrinting all even numbers in array\n");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
			System.out.println("ar["+i+"] : "+arr[i]);
			}
		}
		
		//Print sum of odd elements
		System.out.println("\nPrinting sum of all odd numbers in array");
		int odd=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2!=0) {
			odd+=arr[i];
			}
		}
		System.out.println(odd);
		
		// Sort array
		Arrays.sort(arr);
		System.out.println("\nArray after sorting: " + Arrays.toString(arr));
		
		//Binary search
		System.out.println("\nResult of binary search for 800 : "+Arrays.binarySearch(arr, 800));
		System.out.println("\nResult of binary search for 44 : "+Arrays.binarySearch(arr, 44));

	}

}
