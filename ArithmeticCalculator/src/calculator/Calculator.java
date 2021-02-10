package calculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {


		// Declare variables
				double num1 = 0.0, num2 = 0.0;
			    char operator = '\0';  
			    double ans;
			    
			    
			      
			      // Print the purpose of this program  
			      System.out.println("Simple Arithmetic Calculator");
			      System.out.println("---------------------------");
			      System.out.println("\nAvailable operators:  + - * / ^ ");
			      
			      // Create Scanner class object for user's input
			      Scanner input = new Scanner(System.in);
			      System.out.print("\nTo begin enter two numbers: ");
			      num1 = input.nextDouble();
			      num2 = input.nextDouble();
			      
			      
			      System.out.print("\nEnter an operator: ");
			      operator = input.next().charAt(0);
			      
			      // Implement switch cases for each arithmetic operator
			      
			      switch(operator) {
			      
			         case '+': ans = num1 + num2;
			            break;
			         case '-': ans = num1 - num2;
			            break;
			         case '*': ans = num1 * num2;
			            break;
			         case '/': ans = num1 / num2;
			            break;
			         case '^': ans = Math.pow(num1, num2);
			         	break;
			         	
			      default: System.out.printf("Error! Enter correct operator");
			         return;
			         
			      }
			      
			      //Print out results
			      System.out.print("\nResult:\n");
			      System.out.printf(num1 + " " + operator + " " + num2 + " = " + ans);

	}

}
