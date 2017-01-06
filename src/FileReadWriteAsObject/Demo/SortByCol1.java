package FileReadWriteAsObject.Demo;

import java.util.Comparator;



public class SortByCol1 implements Comparator<DemoClass> {

	@Override
	public int compare(DemoClass o1, DemoClass o2) {
		// TODO Auto-generated method stub
		return o1.col1-o2.col1;
	}

}

 
/*public class MakeComparator implements Comparator<Car> {

	@Override
	public int compare(Car c1, Car c2) {

		if(c1.price==c2.price)  
			return 0;  
		else if(c1.price>c2.price)  
			return 1;  
		else  
			return c2.price-c1.price;  
	}

}*/