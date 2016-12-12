package explore1;

import java.util.ArrayList;
import java.util.List;

public class WordBreak1 {

	public static void main(String[] args) {

		//String s="catsanddogs";  
		String s="catsanddogs";
		List<String> dict=new ArrayList<String>();

		dict.add("cats"); dict.add("and");
		dict.add("cat"); dict.add("sand"); dict.add("dogs");
		//System.out.println("main   "+s.substring(0, 0));

		System.out.println(wordBreak1(s,dict,""));
	}

	private static boolean wordBreak1(String s, List dict,String res) {
		boolean flag=true; 
		char c=' '; 
		if (s.length() == 0) {
			System.out.println("result "+res);
			//return false;
		}
		else{
			String temp=""; 
			for(int i=0;i<s.length();i++)
			{  c=s.charAt(i);
				temp=temp+c;
				int j=i; int count=0;
				if(dict.contains(temp))
				{  // "catsand"
					flag=true;
					//res=res+temp;
					System.out.println("      temp "+temp);
					System.out.println("      ============== RES "+res);
					
					if(!wordBreak1(s.substring(i+1),dict,res+temp+" ")){

						System.out.println("XYZ "+count);
						return false;
					}
				}
			}
		}
		
		System.out.println("OUT "+s);
		return true;
	}
	private static boolean wordBreak0(String s, List dict,String res) {
		boolean flag=true; 
		char c=' '; 

		if (s.length() == 0) {
			System.out.println("result "+res);
			return true;}
		else{
			String temp=""; 
			for(int i=0;i<s.length();i++){ 
				c=s.charAt(i);
				temp=temp+c;

				int j=i; int count=0;

				if(dict.contains(temp)){  // "catsand"
					//j=i; 
					//res="";
					flag=true;
					//res=res+temp;
					System.out.println("      temp "+temp);
					System.out.println("      ============== RES "+res);
					//System.out.println("POMPU " +res.length()+" "+temp.length());

					if(wordBreak0(s.substring(i+1),dict,res+temp+" ")){

						System.out.println("COUNT "+count);
						return true;
					}
				}

			}

			return false;
		}
	}

}
