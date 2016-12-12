package explore1;

public class Single {
	
	private static  Single s;
	
	private Single(){
		
	}
	
	public static synchronized  Single getInstance(){
		if(s==null){
		 s=new Single();
		
		//return s;
		}
		
		return s;
	}
	
	public static void display(){
		System.out.println("POMPU");
	}

}


