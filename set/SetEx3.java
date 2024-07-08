package set;


import java.util.Iterator;
import java.util.LinkedHashSet;


public class SetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> vegetables = new LinkedHashSet<String>();
		
		vegetables.add("Capsicum");
		vegetables.add("Potato");
        vegetables.add("Carrot");
        vegetables.add("Green peas");
        vegetables.add("Broccoli");
        
        Iterator<String> i = vegetables.iterator();
        
        while(i.hasNext()) {
        	System.out.println(i.next());
        }
        
        vegetables.remove("Potato");
        System.out.println("\nThe list of elements after removal of elements:"+ vegetables);
		

	}

}
