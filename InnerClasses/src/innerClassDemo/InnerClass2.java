package innerClassDemo;

public class InnerClass2 {

		
		private String msg = "Inner Classes";

		 void display(){  
			 class Inner{  
				 void msg(){
					 System.out.println(msg);
				 }  
		  }  
		  
		  Inner  inner = new Inner();  
		  inner.msg();  
		 }  

		 
		public static void main(String[] args) {
			InnerClass2  obj = new InnerClass2 ();  
			obj.display();  
			}
	}


