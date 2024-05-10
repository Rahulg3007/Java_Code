package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Sample1 {

	public static void main(String[] args) 
	{
		//Declare ArrayList
		//ArrayList al = new ArrayList(); //We can store homogeneous data in this array
		//ArrayList<Integer> al = new ArrayList<Integer>(); //We can only store integer(Heterogeneous) data in this array
		//ArrayList<String> al = new ArrayList<String>();
		//List al = new ArrayList();
		
		//Add elements to ArrayList
		ArrayList al = new ArrayList();
		al.add(100);
		al.add("Java");
		al.add('A');
		al.add(10.2);
		al.add(true);
		
		System.out.println(al);
		
		//Print Size of Array
		System.out.println("Number of elements in ArrayList:"+al.size());
		
		//Remove element from Array
		al.remove(1); //here 1 is index
		al.remove("Java"); //here java is element
		
		System.out.println("ArrayList after removing element:"+al);
		
		//insert new element in ArrayList
		al.add(2, "Python");
		System.out.println("ArrayList after adding new element:"+al);
		
		//Retrieve specific element 
		System.out.println(al.get(2)); //Python, here 2 is number of element/object
		
		//Change/replace element
		al.set(2, "C#");
		System.out.println("ArrayList after replacing element:"+al);
		
		//Search element
		System.out.println(al.contains("C#")); //Returns true/false
		
		//Check ArrayList is empty or not
		System.out.println(al.isEmpty()); //returns true/false
		
		
		
		//Reading Data
		
		//1.For Loop
		/*
		 * System.out.println("Reading data using for loop");
		 * 
		 * for(int i=0; i<al.size(); i++) 
		 * 	{ 
		 * 		System.out.println(al.get(i)); 
		 * 	}
		 * 
		 * //2.For Each Loop 
		 * System.out.println("Reading data using for each loop");
		 * for(Object a:al) 
		 * { 
		 * System.out.println(a); 
		 * }
		 */
		
		//3.Iterator
		System.out.println("Reading data using Iterator");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
