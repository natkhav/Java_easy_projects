package innerClassDemo;

public class InnerClass1 {
	
	//Declare private variables
	private String str = "Inner class";
	
	class Inner{
		void hello() {System.out.println("Hello from " + str);}
	}

	public static void main(String[] args) {
		// Create an object of InnerClas1
		InnerClass1 obj = new InnerClass1();
		InnerClass1.Inner in = obj.new Inner(); 
		in.hello();
		

	}

}
