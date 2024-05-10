package Collection_FrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap_Sample1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> h = new HashMap<Integer,String>();
		//HashMap h = new HashMap();
		
		h.put(101, "Jhon");
		h.put(102, "Tom");
		h.put(103, "Paul");
		h.put(104, "Shwan");
		
		System.out.println(h); //{101=Jhon, 102=Tom, 103=Paul, 104=Shwan}
		
		h.put(103, "Mike");
		System.out.println(h); //{101=Jhon, 102=Tom, 103=paul, 104=shwan} Paul is replace by Mike because duplicate keys are not allowed
		
		h.put(105, "Mike");
		System.out.println(h); //{101=Jhon, 102=Tom, 103=Mike, 104=Shwan, 105=Mike} duplicate values are allowed
		
		//Retrieve key value
		System.out.println(h.get(102)); //Tom
		
		//Remove pair from HashMap
		System.out.println(h.remove(103));
		System.out.println(h); //{101=Jhon, 102=Tom, 104=Shwan, 105=Mike}
		
		//Contains
		System.out.println(h.containsKey(104)); //true
		System.out.println(h.containsKey(106)); //false
		
		
		System.out.println(h.containsValue("Mike")); //true
		System.out.println(h.containsValue("Adam")); //false
		
		//Is Empty
		System.out.println(h.isEmpty()); //false
		
		//Retrieve KeySet
		System.out.println(h.keySet()); //Return all the keys as set[101, 102, 104, 105]
		
		
		 for(Object i:h.keySet()) 
		 { 
			 System.out.println(i); //Reading all keys individually 
		 }
		
		//Retrieve Values
		System.out.println(h.values()); //Returns all the values as collection [Jhon, Tom, Shwan, Mike]
		
		
		  for(Object i:h.values()) 
		  { 
			  System.out.println(i); //Reading all values individually 
		  }
		 
		
		
		 for(Object i:h.keySet()) 
		 { 
			 System.out.println(i + "=" + h.get(i)); //Reading values with keys 
		 }
		 
		
		//Retrieve all Entries
		System.out.println(h.entrySet()); //Returns all the Entries as set [101=Jhon, 102=Tom, 104=Shwan, 105=Mike]
		
		
		
		//Entry Interface Methods
		for(Map.Entry entry:h.entrySet())
		{
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
		
		//Iterator method
		Set i = h.entrySet();
		
		Iterator it = i.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		 }		
	}

