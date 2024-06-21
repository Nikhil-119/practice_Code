package data_structures;

import java.util.Map;
import java.util.HashMap;

public class MapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> emp = new HashMap<String,Integer>();
		
		//Insert elements to the map
		emp.put("Mohan01", 18771);
		emp.put("Raj02", 28766);
		emp.put("Rohan23", 45000);
		System.out.println("Map"+ emp);
		
		//Access keys of the map
		System.out.println("Keys: "+ emp.keySet());
		
		//Access values of the map
		System.out.println("Values: "+ emp.values());
		
		//Access entries of the map
		System.out.println("Entries: "+ emp.entrySet());
		
		//Remove elements from the map
		int value=emp.remove("Raj02");
		System.out.println("Removed value: "+ value);

	}

}
