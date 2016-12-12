package explore1;

import java.util.ArrayList;
import java.util.List;

public class Sol1 {
	
	public static void main(String[] args) {
		boolean flag=funcAna("abc","abc");
	}
	
	public static boolean funcAna(String a, String b){
		
		//System.out.println("Start");
		
		List<String> L1=new ArrayList<String>();
		for(int i=0;i<a.length();i++){
		  L1.add(a.substring(i,i+1));
		}
		
		for(String s:L1){
			System.out.println(s);
		}
		return false;
		
	}

}
