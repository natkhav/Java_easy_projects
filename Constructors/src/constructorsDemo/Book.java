package constructorsDemo;

// Class Book
public class Book {
	
	// Private data field
	private String bookTitle;
	private String bookAuthor;
	private String bookGenre;
	private int yearPublished;
	private int bookID;
	
	
	//Example of the default constructor
	public Book() {
		bookTitle = "Outliers";
		bookAuthor ="Galdwell";
		bookGenre = "Nonfiction";
		yearPublished = 2008;
		bookID = 1;
		
	}
	
	//Book constructor
	public Book(String bookTitle,String bookAuthor, String bookGenra, int yearPublished, int bookID) {
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookGenre = bookGenra;
		this.yearPublished = yearPublished;
		this.bookID = bookID;
		
	}
	
	// Setters 
	public void setBookTitle(String bookTitle) { // Set book title
		this.bookTitle = bookTitle;
	}
	public void setBookAuthor(String bookAuthor) { // Set book author
		this.bookAuthor = bookAuthor;
	}
	public void setBookGenra(String bookGenra) { // Set book genre
		this.bookGenre = bookGenra;
	}
	public void setYearPublished(int yearPublished) { //Set year published
		this.yearPublished = yearPublished;
	}
	public void setBookID(int bookID) { //set book ID
		this.bookID = bookID;
	}
	
	//Getters
	public String getBookTitle() { // Get book title
		return bookTitle;
	}
	public String getBookAuthor() { // Get book author
		return bookAuthor;
	}
	public String getBookGenra() { // Get book genre
		return bookGenre;
	}
	public int getYearPublished() { // Get year published
		return yearPublished;
	}
	public int getBookID() { // Get book iD
		return bookID;
	}
	
	// Create string method for custom book
	public String bookInfo() {
		String yourBook = "Title: " + this.bookTitle
					+ "\nAuthor: " + this.bookAuthor
					+ "\nGenre: " + this.bookGenre
					+ "\nYear Published: " + this.yearPublished
					+ "\nBook ID: " + this.bookID + "";
		return yourBook;
		
	}//End of Main

} // End of Class
