package encapsulationDemo;

public class StudentTest {

	public static void main(String[] args) {
		
 
	        Student obj = new Student(); 
	        obj.setName("John Smith"); 
	        obj.setAge(19); 
	        obj.setID(12342); 
	        System.out.println("Student name: " + obj.getName()); 
	        System.out.println("Student age: " + obj.getAge()); 
	        System.out.println("Student ID: " + obj.getID());      
	  

	}

}
