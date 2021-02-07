package methods;

public class MethodsDemo {
	
	// Method without parameters
	public void display1() {
		System.out.println("\nMethod without parameters.\n");
	}
	
	//Method with a single parameter
	public void display2(String fruit) {
		fruit = "Apple";
		System.out.println("\nMethod with one parameter returns string : " + fruit + "\n");
	}
	
	//Method with multiple parameters
	public void display3(String color, int num) {
		color = "Green";
		num = 5;
		System.out.println("\nMethod with two different parameters.");
		System.out.println("Returns String : " + color + "and number: " + num);
		
	}

	public static void main(String[] args) {
		// Create object of MethodsDemo
		MethodsDemo obj = new MethodsDemo();
		//calling methods
		obj.display1();
		obj.display2(null);
		obj.display3(null, 0);
		
	}

}
