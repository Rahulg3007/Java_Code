package Collection_FrameWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sample2 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		//Add All elements form one ArrayList to other ArrayList
		ArrayList al2 = new ArrayList();
		
		al2.addAll(al);
		
		System.out.println(al2);
		
		//Remove All elements form one ArrayList to other ArrayList
		al2.removeAll(al);
		System.out.println("After removing all elements:"+al2);
		
		//Sort--Collections
		System.out.println("Elements in ArrayList:"+al); //[X, Y, Z, A, B, C]
		
		Collections.sort(al);
		
		System.out.println("Elements after sorting:"+al); //[A, B, C, X, Y, Z]
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Elements after sorting in reverse order:"+al); //[Z, Y, X, C, B, A]
		
		
		//Shuffling--Collections
		Collections.shuffle(al);
		System.out.println("Elements after shuffling:"+al); //[X, Y, B, Z, C, A]
	}
}
