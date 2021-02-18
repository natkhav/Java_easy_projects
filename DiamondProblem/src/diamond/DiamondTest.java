package diamond;

public class DiamondTest implements First, Second,Third, Fourth{
	
	public void show() 
    {  
        First.super.show(); 
        Second.super.show();
        Third.super.show();
        Fourth.super.show();
    } 
    public static void main(String args[]) 
    { 
        DiamondTest ob = new DiamondTest(); 
        ob.show(); 
    } 


}
