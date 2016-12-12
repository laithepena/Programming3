package explore1;



import java.util.HashSet;
import java.util.Set;

// ############   Author Shivadeep Borgohain ###############################

public class StringPermutationAll {

	public static void main(String[] args) {

		String s="abc"; 
		//String a=funcStringPerm(s.toCharArray(),0,s.length()-1);
		Set<String> s1=new HashSet<String>();
		
		funcStringPerm(s.toCharArray(),0,s.length()-1,s1);
		
		for(String ss:s1){
			System.out.println(ss);
		}
		
	}

	private static void funcStringPerm(char[] c,int i,int n,Set s1) {

		//Set<String> s1=new HashSet<String>();
		if(i==n){
			//System.out.print("##########  ");
			//System.out.println(c);
			// return String.valueOf(c);
            s1.add(String.valueOf(c));

		}


		else{
			for(int j=i;j<=n;j++){
				//swap(i,j)
				char temp=c[i];
				c[i]=c[j];
				c[j]=temp;
				/*System.out.println(c);
				System.out.println("End --------------");*/
				funcStringPerm(c,i+1,n,s1);

				//swap(i,j);
				char temp1=c[i];
				c[i]=c[j];
				c[j]=temp1;
				/*System.out.println(c);
				System.out.println("End AAAAAAAAAAAAAAAAAAAA");*/
			}



		}




	} 



}
