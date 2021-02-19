package fileHandlingProject;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;


public class CreateFile {
	
		public static void main(String[] args) throws IOException {
		
		 try {
			 //Create new file test.txt
		      File newFile = new File("test.txt");
		      if (newFile.createNewFile()) {
		        System.out.println("File created: " + newFile.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		 try {
			 //Write initial content to test.txt file
		      FileWriter myWriter = new FileWriter("test.txt", true);
		      myWriter.write("The Cow ");
		      myWriter.close();
		      
		      System.out.println("Successfully wrote to the file.");
		      
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

   } //End of Main
}// End of Class

