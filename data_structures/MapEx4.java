package data_structures;

import java.util.Map;
import java.util.TreeMap;

public class MapEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> fruits = new TreeMap<String,Integer>();
		
		//Adding elements in the Tree_map
		fruits.put("Cherry", 200);
		fruits.put("Banana", 70);
		fruits.put("Apple", 100);
		fruits.put("Mango", 600);
		System.out.println(fruits);
		
		Map<String,Integer> morefruits = new TreeMap<String,Integer>();
		
		morefruits.put("Strawberry", 150);
		morefruits.put("Jackfruit", 200);
		morefruits.put("Lichi", 230);
		
		//Combining two maps
		fruits.putAll(morefruits);
		System.out.println(fruits);
		
		//Get the element
		System.out.println("The value of searched key is "+ fruits.get("Mango"));
		
		//Removing the element
		fruits.remove("Cherry");
		System.out.println("List after removing element");
		System.out.println(fruits);
		
		//Clearing the whole Tree_map
		fruits.clear();
		System.out.println(fruits);
		
		System.out.println("\n"+ fruits.isEmpty());
		
		fruits.put("Chickoo",50);
		System.out.println("\n"+ fruits.isEmpty());
		
		

	}

}
