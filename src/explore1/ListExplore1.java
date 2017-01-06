package explore1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListExplore1 {
	
	
	public static void main(String[] args) {
		
		List<String> l1=new ArrayList<>();
		
		l1.add(0, "pom"); l1.add(1, "pim");
		l1.add(1, "jlo");
		
		for(String s:l1){
			System.out.println(s);
		}
		
		
		Map<String,Integer> m1=new HashMap<>();
		
		m1.put("key1", 101);m1.put("key2", 102);
		
		m1.put("key2", 1022);
		
		for(Map.Entry<String,Integer> entry: m1.entrySet()){
			
			System.out.println(entry.getKey()+"  "+entry.getValue());
			
		}
		
		
		
	}

}
