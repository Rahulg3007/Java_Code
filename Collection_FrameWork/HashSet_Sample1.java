package Collection_FrameWork;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Sample1 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet(); //default capacity is 16
		
		//Adding element
		hs.add(10);
		hs.add("Java");
		hs.add(20.5);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs); //insertion order not preserved
		
		//remove
		hs.remove(20.5);
		System.out.println(hs); //[null, Java, A, 10, true]
		
		//contains
		System.out.println(hs.contains("Java")); //true
		System.out.println(hs.contains("python")); //false
		
		//isEmpty
		System.out.println(hs.isEmpty()); //false
		
		
		//Reading data
		
		//1.For Each Loop
		System.out.println("Reading data using for each loop");
		for(Object value:hs)
		{
			System.out.println(value);
		}
		
		//2.Iterator
		System.out.println("Reading data using Iterator");
		Iterator it= hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
}
