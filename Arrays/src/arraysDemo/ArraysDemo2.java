package arraysDemo;

public class ArraysDemo2 {

	public static void main(String[] args) {
		
		//Create an array with 7 allocated spaces
		int arr[]=new int[7];
		int m=0;
		arr[0]=1000;
		arr[1]=200;
		m=2;
		System.out.println("Printing contents of array before insertion");
		for (int i = 0; i < m; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//Insert new element at index 3
		int newElement=999;
		int position=3;
		for(int i=m;i>position-1;i--) {
			arr[i]=arr[i-1];
		}
		arr[position-1]=newElement;
		m++;
		System.out.println("\nPrinting contents of array after insertion");
		for (int i = 0; i < m; i++) {
			System.out.print(arr[i]+" ");
		}
		
		//Print specific index
		System.out.println("Index [0] contains " + arr[0]);
		System.out.println("Index [5] contains " + arr[5]);
	}

}
