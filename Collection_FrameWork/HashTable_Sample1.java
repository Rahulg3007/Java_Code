package Collection_FrameWork;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTable_Sample1
{
	public static void main(String[] args) 
	{
		//Hashtable t = new Hashtable();
		Hashtable<Integer,String> t = new Hashtable<Integer,String>();
		t.put(101, "Java");
		t.put(102, "Python");
		t.put(103, "C++");
		//t.put(104, null); Hashtable doesn't allow null it will throw NullPointerException
		
		System.out.println(t);
		
		//Retrieve value
		System.out.println(t.get(101)); //Java
		
		//Remove value
		System.out.println(t.remove(103)); //C++
		System.out.println(t); //{102=Python, 101=Java}
		
		//Contains
		System.out.println(t.containsKey(102)); //true
		System.out.println(t.containsKey(104)); //false
		
		System.out.println(t.containsValue("Java")); //true
		System.out.println(t.containsValue("C#")); //false
		
		//Is Empty
		System.out.println(t.isEmpty()); //false
		
		//Retrieve all keys & values
		System.out.println(t.keySet()); //[102, 101]
		
		System.out.println(t.values()); //[Python, Java]
		
		
		//Retrieve data using loop
		
		for(Object k:t.keySet())
		{
			System.out.println(k + " " + t.get(k));
		}
		
		//Entry Specific Methods
		for(Map.Entry e:t.entrySet())
		{
			System.out.println(e.getKey()+ " " + e.getValue());
		}
		
		//Iterator 
		Set s = t.entrySet();
		
		Iterator it = s.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
}
