package encapsulationDemo;

public class Student {

	private String Name; 
    private int ID; 
    private int Age;
    public int getAge()  
    { 
      return Age; 
    } 
    public String getName()  
    { 
      return Name; 
    } 
    public int getID()  
    { 
       return ID; 
    } 
    public void setAge( int newAge) 
    { 
      Age = newAge; 
    } 
    public void setName(String newName) 
    { 
      Name = newName; 
    } 
    public void setID( int newID)  
    { 
      ID = newID; 
    } 
}

