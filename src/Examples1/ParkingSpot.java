package Examples1;

public class ParkingSpot {
	
	private int slotNo;
	private Vehicle v1;
	 static int counter=0;
	
	
	
	private boolean isOccupied;
	
	public ParkingSpot(int n,Vehicle v){
		this.slotNo=n;
		
		
		
		this.v1=v;
		counter++;
		
	}
	
	/*public ParkingLot(int slotNo,Vehicle v1){
		this.slot=new ParkingSpot(slotNo,"regular",false,v1);
	}*/
	
	public void display(){
		System.out.println(this.slotNo +" "+this.v1.make);
	}
	
	

}
