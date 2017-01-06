package FileReadWrite;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class readWriteTextFile {
	
	
    public  void mfileWrite(String filename) {

        // The name of the file to open.
       // fileName = "src/FileReadWrite/temp.txt";

        try {
            // Assume default encoding.
            FileWriter fileWriter =
                new FileWriter(filename);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write("Hello there, Pompu");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine();
            bufferedWriter.write("We are writing");
            bufferedWriter.write(" the text to the file.");
            bufferedWriter.newLine();
            bufferedWriter.write("A the text to the file.");
            // Always close files.
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println(
                "Error writing to file '"
                + filename + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        }
    }
	
	public  List<String> mfileRead(String filename) {

		List<String> l1=new ArrayList<>();
		String line = null;

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = 
					new FileReader(filename);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = 
					new BufferedReader(fileReader);

			while((line = bufferedReader.readLine()) != null) {
				//System.out.println(line);
				
				l1.add(line);
			}   

			// Always close files.
			bufferedReader.close();         
		}
		catch(FileNotFoundException ex) {
			System.out.println(
					"Unable to open file '" + 
							filename + "'");                
		}
		catch(IOException ex) {
			System.out.println(
					"Error reading file '" 
							+ filename + "'");                  
			// Or we could just do this: 
			// ex.printStackTrace();
		}
		return l1;
	}
}
