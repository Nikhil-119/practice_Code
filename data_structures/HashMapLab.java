package data_structures;

import java.util.HashMap;

public class HashMapLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> emp = new HashMap<Integer,String>(); //Creating HashMap
		
		//Adding elements in Hash_map
		emp.put(1, "Nikhil");
		emp.put(2, "Abhishek");
		emp.put(3, "abcd");
		emp.put(4, "efg");
		emp.put(5, "Kapil");
		System.out.println("HashMap: "+ emp);
		
		//Getting the element
		System.out.println("\nThe value of the searched employee id is "+ emp.get(1));
		
		//Removing the element
		emp.remove(4);
		System.out.println("\nList after removing element: "+ emp);
		
		
		}

}
