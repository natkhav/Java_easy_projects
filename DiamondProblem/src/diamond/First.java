package diamond;

interface First {
	
	default void show() 
    { 
        System.out.println("Default First"); 
    } 
} 

interface Second 
{  
    default void show() 
    { 
        System.out.println("Default Second"); 
    } 
}

interface Third 
{  
    default void show() 
    { 
        System.out.println("Default Third"); 
    } 
}  

interface Fourth 
{  
    default void show() 
    { 
        System.out.println("Default Fourth"); 
    } 
} 


	
	


