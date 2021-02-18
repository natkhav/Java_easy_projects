package exceptions_eg2;

public class ExcDemo3 extends Exception{
	   String str1;
	   
	   ExcDemo3(String str2) {
		str1 = str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: " + str1) ;
	   }
	}
	



