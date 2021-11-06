package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapSize {

	public static void main(String[] args) {
		  HashMap<Integer,String> HM=new HashMap<Integer,String>();//Creating HashMap    
		   HM.put(1,"Java");  //Put elements in Map. Key is Integer type and Value is String type.
		   HM.put(2,"C");    
		   HM.put(3,"Python");   
		   HM.put(4,"Ruby");   
		       
		   System.out.println("Elements of Hashmap are");  
		   for(Map.Entry m : HM.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue()); 
		   		}
		    System.out.println("Size of the HashMap is "+HM.size());
		 } 
	}  
		
	


