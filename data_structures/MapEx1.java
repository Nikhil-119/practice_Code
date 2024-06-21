package data_structures;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class MapEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> user = new HashMap<String,String>();
		
		user.put("actor", "sunil");
		user.put("ceo", "sam");
		user.put("clark", "raman");
		user.put("accountant", "raj");
		user.put("clerk", "raj");
		
		System.out.println(user.get("doctor"));
		
		Set<String> keys = user.keySet();
		for(String key:keys) {
			System.out.println(user.get(key));
		}
		
		for(String key:keys) {
			System.out.println(key + "" + user.get(key));
		}
		
		

	}

}
