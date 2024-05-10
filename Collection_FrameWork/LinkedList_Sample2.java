package Collection_FrameWork;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Sample2 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		System.out.println(l);
		
		//adding all elements
		LinkedList l2 = new LinkedList();
		l2.addAll(l);
		System.out.println(l2); //X, Y, Z, A, B, C]
		
		//removing all elements
		l2.removeAll(l);
		System.out.println(l2); //[]
		
		//sorting
		System.out.println("Before Sortig:"+l); //[X, Y, Z, A, B, C]
		Collections.sort(l);
		System.out.println("After Sorting:"+l);  //[A, B, C, X, Y, Z]
		
		//reverse
		Collections.sort(l,Collections.reverseOrder());
		System.out.println(l); //[Z, Y, X, C, B, A]
		
		//shuffling
		Collections.shuffle(l);
		System.out.println(l); //[X, A, B, Y, C, Z]
	} 
}
