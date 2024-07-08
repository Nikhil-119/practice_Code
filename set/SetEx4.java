package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // Using HashSet
		Set<String> favoriteFruits = new HashSet<>();
		     
        // Adding elements to the HashSet
		favoriteFruits.add("Apple");
		favoriteFruits.add("Banana");
		favoriteFruits.add("Orange");
		favoriteFruits.add("Mango");
        System.out.println("Favorite Fruits (HashSet): " + favoriteFruits);
		       
		// Removing an element
		favoriteFruits.remove("Banana");
		System.out.println("\nFavorite Fruits after removal (HashSet): " + favoriteFruits);
		       
		// Checking if an element is present
		boolean hasApple = favoriteFruits.contains("Apple");
		System.out.println("\nIs Apple a favorite fruit? " + hasApple);
		        
		// Iterating over the elements
		System.out.println("\nIterating over favorite fruits (HashSet):");
		for (String fruit : favoriteFruits) {
			System.out.println(fruit);
		}

		// Using LinkedHashSet
	    Set<String> linkedFavoriteVegetables = new LinkedHashSet<>();
        
	    // Adding elements to the LinkedHashSet
		linkedFavoriteVegetables.add("Tomato");
		linkedFavoriteVegetables.add("Cucumber");
		linkedFavoriteVegetables.add("Lettuce");
		linkedFavoriteVegetables.add("Bell Pepper");
        System.out.println("\nFavorite Vegetables (LinkedHashSet): " + linkedFavoriteVegetables);

		// Removing an element
		linkedFavoriteVegetables.remove("Lettuce");
        System.out.println("\nFavorite Vegetables after removal (LinkedHashSet): " + linkedFavoriteVegetables);

		// Checking if an element is present
		boolean hasLettuce = linkedFavoriteVegetables.contains("Lettuce");
        System.out.println("\nIs Lettuce a favorite vegetable? " + hasLettuce);

		// Iterating over the elements
		System.out.println("\nIterating over favorite vegetables (LinkedHashSet):");
		for (String vegetable : linkedFavoriteVegetables) {
			System.out.println(vegetable);
		}
	
	}
		
}


