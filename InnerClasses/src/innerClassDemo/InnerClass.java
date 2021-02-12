package innerClassDemo;


abstract class AbstractClass {
	   public abstract void display(); // Abstract method to be called from InnerClass
	}

public class InnerClass {

	public static void main(String[] args) {
		AbstractClass i = new AbstractClass() {

	         public void display() {
	            System.out.println("Hello from the abstract class");
	         }
	      };
	      
	      i.display();

	}

}
