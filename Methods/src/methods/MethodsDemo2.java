package methods;

public class MethodsDemo2 {
	
	int val =150;
	int operation(int val) {
		val = val *10/100;
		return(val);
	}
	// Multiplication method
	public int multiplication(int x, int y) {
		int z = x * y;
		return z;
	}
	
	// Method overloading
	public void area(int a, int b) {
		System.out.println("The area of a triangle is: " + (0.5*a*b));
	}
		public void area(int r) {
			System.out.println("Area of a circle: " + (3.14*r*r));
		}
		
		
	//Main method
	public static void main(String[] args) {
		// Create object to call operation method
		MethodsDemo2 obj = new MethodsDemo2();
		System.out.println("Result before operation: " + obj.val);
		obj.operation(100);
		System.out.println("Result after operation: " + obj.val);
		
		// Creating object to call multiplication method
		MethodsDemo2 mult = new MethodsDemo2();
		int product = mult.multiplication(10, 3);
		System.out.println("Result of multiplication function: " + product );
		
		// Creating the object to call area method
		MethodsDemo2 ar = new MethodsDemo2();
		ar.area(10,12);
		ar.area(5);

	}

}
