package Collection_FrameWork;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Sample1 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add(10);
		l.add("Java");
		l.add('A');
		l.add(10.1);
		l.add(true);
		l.add(null);
		
		System.out.println(l);
		
		System.out.println(l.size());
		
		//Remove
		l.remove(3);
		System.out.println("New List after removing element:"+l);
		
		//insert/adding new element in the middle of linked list
		l.add(3, "Hello");
		System.out.println("New list after adding element"+l);
		
		//retrieving value/object
		System.out.println(l.get(1)); //Java
		
		//setting/changing value at index
		l.set(5, "Python");
		System.out.println("list after setting value:"+l); // [10, Java, A, Hello, true, Python]
		
		//Contains
		System.out.println(l.contains("Java")); //true
		System.out.println(l.contains("C++")); //false
		
		//isEmpty
		System.out.println(l.isEmpty()); //false
		
		
		
		//Reading linkedlist data 
		//1.for loop
		System.out.println("Reading data using for loop");
		for(int i=0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
		
		//2.for each loop
		System.out.println("Reading data using for each loop");
		
		for(Object a:l)
		{
			System.out.println(a);
		}
		
		//3.Iterator
		System.out.println("Reading data using iterator");
		Iterator it = l.iterator() ;
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
}
