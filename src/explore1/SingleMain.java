package explore1;

public class SingleMain  {
	
	/*SingleMain(){
		
	}*/
	
	public static void main(String[] args) {
		
		//SingleMain Sm=new SingleMain();
		
		//Single s2=new Single(); // as the constructor is private 
		
	 Single s2=Single.getInstance();
	 s2.display();
	 
	
	}

}
