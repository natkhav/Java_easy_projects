package objectsDemo;

public class PetObject {

    String pet; 
    String breed; 
    int age; 
    String color; 
    
    public PetObject(String pet, String breed, int age, String color) 
    { 
        this.pet = pet; 
        this.breed = breed; 
        this.age = age; 
        this.color = color; 
    } 
    public String getPet() 
    { 
        return pet; 
    } 
    public String getBreed() 
    { 
        return breed; 
    } 
    public int getAge() 
    { 
        return age; 
    } 
    public String getColor() 
    { 
        return color; 
    } 
    @Override
    public String toString() 
    { 
        return("Hi I am a "+ this.getPet()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and"+ this.getColor() + "."); 
    } 
    public static void main(String[] args) 
    { 
    	PetObject scott = new PetObject("Dog","Poodle", 5, "black"); 
        System.out.println(scott.toString()); 
    } 

}
