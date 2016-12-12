package explore1;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
	
	public static void main(String[] args) {
		
		//Map<Character,Integer> m1=new HashMap<Character,Integer>();
		
		Map<String,Integer> m2=new HashMap<String,Integer>();
		
		m2.put("pom", 100); m2.put("pim", 101);
		
		for(Map.Entry<String,Integer> mm: m2.entrySet()){
			
			System.out.println(mm.getKey()+"  "+mm.getValue());
			
		}
	}

}
