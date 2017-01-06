package FileReadWriteAsObject;



import java.io.*;
import java.util.ArrayList;
import java.util.List;

import FileReadWriteAsObject.Demo.DemoClass;

public class readWriteTextFileAsObject {
	
	public  void mfileWriteAsObject(String filename,List<DemoClass> listOfLines) {

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
            //bufferedWriter.write("Hello there, Pompu");
            int i=0;
            for(DemoClass d1:listOfLines){
            	bufferedWriter.write(d1.getCol1()+","+d1.getCol2()+","+d1.getCol3());
            	
            	if(i!=listOfLines.size()-1){
            	bufferedWriter.newLine();
            	}
            	i++;
            }
            
           // bufferedWriter.write(listOfLines.get(index));
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
	
	
	public  List<DemoClass> mfileReadAsObject(String filename,Class DemoClass ) {

		
		
		List<DemoClass> l1=new ArrayList<>();
		String line = null;

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = 
					new FileReader(filename);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = 
					new BufferedReader(fileReader);
//#######################################################################
			while((line = bufferedReader.readLine()) != null) {
				//System.out.println(line);
				DemoClass d1=new DemoClass(); // CLASS Object
				String[] arr=line.split(",");
				d1.setCol1(Integer.parseInt(arr[0]));  // parseInt
				
				d1.setCol2(arr[1]);
				
				d1.setCol3(Integer.parseInt(arr[2]));  // parseInt
				
				l1.add(d1);
			}   

//#######################################################################
			
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

