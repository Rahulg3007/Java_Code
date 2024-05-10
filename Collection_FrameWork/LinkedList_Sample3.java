package Collection_FrameWork;

import java.util.LinkedList;

public class LinkedList_Sample3 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		
		l.add("Java");
		l.add("Python");
		l.add("C++");
		
		System.out.println(l); //[Java, Python, C++]
		
		//Add first and last element
		l.addFirst("C#");
		l.addLast("Ruby");
		
		System.out.println(l); //[C#, Java, Python, C++, Ruby]
		
		//Get first and last element
		System.out.println(l.getFirst()); //C#
		
		System.out.println(l.getLast()); //Ruby
		
		//Removing first and last element
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println("After removing first and last element"+l);
		
		
	}
}
