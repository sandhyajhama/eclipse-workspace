package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class HashMap1 {

	public static void main(String[] args) {
		
		Map <Integer, String> map = new HashMap<Integer,String>();
		
		map.put(1, "Sandhya");
		map.put(2, "Sumedha");
		map.put(3, "Shipra");
		map.put(4, "Seema");
		map.put(6, "Sanya");
		
		map.entrySet();		//convert the hashmap into set for traversing
		
		for(Map.Entry m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
		
		map.putIfAbsent(5, "Sanaya");
		
		map.put(7, "Sayara");
		
		map.putAll(map);
		
		System.out.println("updated list is :");
		
		for(Map.Entry m : map.entrySet()) {
			
			System.out.println(m.getKey()+" " + m.getValue());
		}
		map.entrySet();
		
	}

}
