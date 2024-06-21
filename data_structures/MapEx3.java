package data_structures;

import java.util.TreeMap;
import java.util.Map;

public class MapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> treeMap = new TreeMap<String,Integer>();
		
		//Adding elements to the tree map
		treeMap.put("A", 1);
		treeMap.put("B", 2);
		treeMap.put("C", 3);
		
		//Getting values from the tree map
		int valueA = treeMap.get("A");
		System.out.println("Value of A: "+ valueA);
		
		//Removing elements from the tree map
		treeMap.remove("B");
		
		//Iterating over the elements of the tree map
		for(String key : treeMap.keySet()) {
			System.out.println("Key: "+ key + ", Value: " + treeMap.get(key));
		}

	}

}
