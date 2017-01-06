package FileReadWrite;



import java.util.Collections;
import java.util.List;

public class mainReadWrite {
			
public static void main(String[] args) {
	
	readWriteTextFile readWrite1=new readWriteTextFile();
	
	readWrite1.mfileWrite("src/FileReadWrite/temp.txt");
	
	
	
	List<String> listOfLines=readWrite1.mfileRead("src/FileReadWrite/temp.txt");
	
	Collections.sort(listOfLines);
	
	for(String s:listOfLines){
		System.out.println(s);
	}
	
}
}
