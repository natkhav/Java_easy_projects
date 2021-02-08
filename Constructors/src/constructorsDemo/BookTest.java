package constructorsDemo;

public class BookTest {

	public static void main(String[] args) {
		
		//Create default book object
		Book defaultBook = new Book();
		
		//Create custom book 1
		Book bookOne = new Book("Mastermind", "Maria Konnikova", "Nonfiction", 2010, 2);
		
		//Create custom book2
		Book bookTwo = new Book("The Gift", "Lewis Hyde", "Biography", 2007, 3);
		
		//Print info for default book
		System.out.println("Book 0 (default constructor)");
		System.out.println("-------------------------------");
		System.out.println(defaultBook.bookInfo());
		
		//Print info for book 2
		System.out.println("\nBook 1" );
		System.out.println("-------------------------------");
		System.out.println(bookOne.bookInfo());
		
		
		//Print info for book 2
		System.out.println("\nBook 2");
		System.out.println("-------------------------------");
		System.out.println(bookTwo.bookInfo());
		

	}//End of Main

}//End of Class
