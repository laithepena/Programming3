package metrics.matching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainMetric {

	
	public static void main(String[] args) {
	
	//	User u1=;
		
	List<User> l1=new ArrayList<User>();
		
		l1.add(new User("pompu",10));
		
		l1.add(new User("pimpu",20));
		
		l1.add(new User("jlo",30));
		
		Collections.sort(l1,new SortByNameUser());
		for(User u:l1){
			System.out.println(u.name+" "+u.age);
		}
		
		
		
 List<User> l2=new ArrayList<User>();
		
		l2.add(new User("pompu",10));
		
		l2.add(new User("jlo",30));
		
		l2.add(new User("pimpu",20));
		
		
		Collections.sort(l2,new SortByNameUser());
		
		
		
		System.out.println();
		for(User u:l2){
			System.out.println(u.name+" "+u.age);
		}
		
		System.out.println();
		if(l1.equals(l2)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
		
		
	}
	
}
