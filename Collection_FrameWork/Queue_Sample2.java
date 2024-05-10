package Collection_FrameWork;

import java.util.Iterator;
import java.util.LinkedList;

public class Queue_Sample2 
{
	public static void main(String[] args) 
	{
		LinkedList p= new LinkedList();
		
		//Adding element  add() offer() 
		
		p.add("A");
		p.add("B");
		p.add("C");
		p.offer("C");
		p.offer(100); //allowed in queue because its accept homogeneous data
		
		System.out.println(p); //[A, B, C, C] insertion order preserved and duplicates allowed
		
		
		//get Head element  element()  peak()
		System.out.println(p.element());  //A   //if Queue is empty then returns NoSuchElement Exception
		
		System.out.println(p.peek()); //A   //if Queue is empty then returns null
		
		
		//Return & Remove element from queue   remove()  poll()
		//System.out.println(p.remove()); //A      //if Queue is empty then returns NoSuchElement Exception
		//System.out.println(p); //[B, C, C]
		
		//System.out.println(p.poll()); //A     //if Queue is empty then returns null
		//System.out.println(p);  ////[B, C, C]
		
		
		//Reading data
		//1.For Each Loop
		System.out.println("Reading data using for each loop");
		for(Object value:p)
		{
			System.out.println(value);
		}
		
		
		//2.Iterator
		System.out.println("Reading data using iterator");
		
		Iterator it = p.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
