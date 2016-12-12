package explore1;

public class String2Int {
	
	public static void main(String[] args) {
		
		String a="-1234";
		func(a);
	}
	
	public static int func(String ar){
		int n = 0; int s=0;
		for(int i=0;i<ar.length();i++){
			System.out.println(ar.charAt(i));
			System.out.println("i  "+i);
			if(ar.charAt(i)=='-'){
				System.out.println("BREAK");
				continue;
			}
			
			System.out.println("i  "+i);
			s=s*10;
			s=s+(ar.charAt(i)-'0');// s=0+1; s=1+
			
		}
		
		System.out.println("s "+s);
		return 0;
		
	}

}
