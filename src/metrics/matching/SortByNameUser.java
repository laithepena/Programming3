package metrics.matching;

import java.util.Comparator;

public class SortByNameUser implements Comparator<User> {

	

	@Override
	public int compare(User o1, User o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}

}
