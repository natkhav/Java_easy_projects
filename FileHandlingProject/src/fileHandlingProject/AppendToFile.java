package fileHandlingProject;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendToFile {

	public static void main(String[] args) throws IOException{
		
		//Declaring local variables
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			//Initializing FileWriter, BufferdWriter and PrintWriter
			 fw = new FileWriter("test.txt", true);
			 bw = new BufferedWriter(fw);
			 pw = new PrintWriter(bw);
			 
			 //Writing content to be appended
			 pw.println(" jumped over the moon! "); 
			 
			 //Displaying msg that data was appended successfully
			 System.out.println("Data was appended"); 
			
		} finally {
			try { 
				pw.close(); 
				bw.close(); 
				fw.close(); 
		} catch (IOException e) {
			e.printStackTrace();	
		}
			
		}
		
		
	} //End of Main
} // End of Class
