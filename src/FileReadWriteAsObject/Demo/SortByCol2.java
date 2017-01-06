package FileReadWriteAsObject.Demo;

import java.util.Comparator;

public class SortByCol2 implements Comparator<DemoClass> {

	@Override
	public int compare(DemoClass o1, DemoClass o2) {
		// TODO Auto-generated method stub
		return o1.col2.compareTo(o2.col2);
	}

}