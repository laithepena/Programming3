package explore1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class explore2 {
	
	public static void main(String[] args) {
		
		String s1="shivaay";
		
		func(s1);
	}
static void func(String s2)
{
	Map<Character,Integer> m1=new HashMap<Character,Integer>();
	
	for(int i=0;i<s2.length();i++){
		
		if(!m1.containsKey(s2.charAt(i))){
			m1.put(s2.charAt(i), 1);
		}
		else{
			System.out.println("POM "+s2.charAt(i));
			m1.put(s2.charAt(i), m1.get(s2.charAt(i))+1);
		}
	}
	
	/*for (Map.Entry<Character, Integer> entry : m1.entrySet()) {
		System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue());
	}
*/
	
	m1.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));
	
}
}
