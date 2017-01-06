package FileReadWriteAsObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import FileReadWriteAsObject.Demo.*;
/*import FileReadWriteAsObject.Demo.DemoClass;
import FileReadWriteAsObject.Demo.SortByCol1;
import FileReadWriteAsObject.Demo.SortByCol2;*/

public class mainReadWriteAsObject {

	public static void main(String[] args) {

		readWriteTextFileAsObject readWriteObj1 = new readWriteTextFileAsObject();

		// pompu

		// read1.mfileRead("src/FileReadWriteAsObject/temp.txt");

		List<DemoClass> listOfLines = readWriteObj1.mfileReadAsObject("src/FileReadWriteAsObject/temp2.txt",
				DemoClass.class);

		Collections.sort(listOfLines, new SortByCol1());

		for (DemoClass s : listOfLines) {
			System.out.println(s.getCol1() + " " + s.getCol2() + " " + s.getCol3());
		}

		System.out.println("     ");
		Collections.sort(listOfLines, new SortByCol2());

		for (DemoClass s : listOfLines) {
			System.out.println(s.getCol1() + " " + s.getCol2() + " " + s.getCol3());
		}

		System.out.println("     ");

		// ############################################################
		// putting in MAP
		// #################################################################

		Map<String, List<DemoClass>> map1 = new HashMap<String, List<DemoClass>>();
		for (DemoClass s : listOfLines) {

			List<DemoClass> list2 = new ArrayList<DemoClass>();
			list2.add(s);
			/*
			 * System.out.println(s.getCol2()); //DemoClass dTemp=new
			 * DemoClass(); map1.put(s.getCol2(),list2 );
			 */

			if (!map1.containsKey(s.getCol2())) {
				map1.put(s.getCol2(), list2);
			} else {
				map1.get(s.getCol2()).add(s);
			}

		}

		System.out.println(map1.size());

		for (Map.Entry<String, List<DemoClass>> entry : map1.entrySet()) {

			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		for (Map.Entry<String, List<DemoClass>> entry : map1.entrySet()) {
			
			  List<DemoClass> list22 = new ArrayList<DemoClass>();
			  System.out.print(entry.getKey() +"  ---> ");
			  //+"   "+entry.getValue()); 
			  list22.addAll(entry.getValue());
			  for(DemoClass d:list22){ //System.out.println("XYZ");
			 System.out.print(d.getCol1()+" "+d.getCol2()+" "+d.getCol3()
			  +" , "); }
			  
			  System.out.println();
			 
			 }

		// readWriteObj1.mfileWriteAsObject("src/FileReadWriteAsObject/temp3.txt",listOfLines);

	}
}
