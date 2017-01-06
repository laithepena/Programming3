package Examples1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class mainParking {
	
	public static void main(String[] args) {
		
		Vehicle v1=new Vehicle("honda");
		Vehicle v2=new Vehicle("bmw");
		
		//Set<ParkingSpot> parkingSpots=new HashSet <ParkingSpot>();
		
		Map<Integer,Vehicle> parkingPairMap= new HashMap <Integer,Vehicle>();
		//
		/*ParkingSpot ps1=new ParkingSpot(101,v1);
		ParkingSpot ps2=new ParkingSpot(102,v2);
		
		parkingSpots.add(ps1);parkingSpots.add(ps2);
		*/
		
		parkingPairMap.put(101,v1); parkingPairMap.put(102,v2);
		
		for(Map.Entry<Integer,Vehicle> entry: parkingPairMap.entrySet()){
			
			System.out.println(entry.getKey()+" "+entry.getValue().make);
			
		}
		
	}

}
