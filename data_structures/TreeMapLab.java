package data_structures;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> cars = new TreeMap<String,Integer>(); //Creating TreeMap
		
		//Adding elements in Tree_map
		cars.put("Hyundai Creta", 1100000);
		cars.put("Mahindra XUV700", 1400000);
		cars.put("Maruti Swift", 650000);
		cars.put("Tata Nexon", 800000);
		System.out.println(cars);
		
		Map<String,Integer> morecars = new TreeMap<String,Integer>(); //Creating another Map
		
		morecars.put("Honda City", 1186000);
		morecars.put("Toyota Fortuner", 3343000);
		morecars.put("Tata Punch EV", 1099000);
		
		//Adding a specified map into another map
		cars.putAll(morecars);
		System.out.println("\n"+ cars); /*Note: In the output, TreeMap maintains ascending order 
		                                        of key values.*/
		
		//Get the element
	    System.out.println("\nThe value of specified car is "+ cars.get("Tata Nexon"));
	    
	    //Removing the element
	    cars.remove("Hyundai Creta");
	  	System.out.println("\nList after removing element: ");
	  	System.out.println(cars);
	  	
	    //Clearing the whole Tree_map
	  	cars.clear();
	  	System.out.println("\n"+ cars);
	  		
	  	System.out.println("\n"+ cars.isEmpty());
	  		
	  	cars.put("Maruti Swift", 650000);
	  	System.out.println("\n"+ cars.isEmpty());
		

	}

}
