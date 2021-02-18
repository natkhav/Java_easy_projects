package exceptions_eg2;

public class Example {
	public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new ExcDemo3("This is My error Message");
		}
		catch(ExcDemo3 exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
}
