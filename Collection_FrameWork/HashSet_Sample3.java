package Collection_FrameWork;

import java.util.HashSet;

public class HashSet_Sample3 
{
	public static void main(String[] args) 
	{
		
		//Union intersection, difference
		HashSet hs1 = new HashSet();
		
		hs1.add(1);
		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		hs1.add(5);
		
		System.out.println("HashSet 1:" + hs1); //[1, 2, 3, 4]
		
		HashSet hs2 = new HashSet();
		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		
		System.out.println("HashSet 2:" + hs2); //[3, 4, 5]
		
//		//Union
//		hs1.addAll(hs2);
//		
//		System.out.println("Union:"+ (hs1)); //[1, 2, 3, 4, 5]
//		
//		//Intersection
//		hs1.retainAll(hs2);
//		System.out.println("Intersection:" + hs1); //3, 4, 5]
		
		
		//Difference
//		hs1.removeAll(hs2);
//		System.out.println("Difference:" + hs1); //[1, 2]
		
		//SubSet
		System.out.println(hs1.containsAll(hs2)); //true
		
	}
}
