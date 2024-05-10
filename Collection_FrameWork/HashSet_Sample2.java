package Collection_FrameWork;

import java.util.HashSet;

public class HashSet_Sample2 
{
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		
		hs.add(2);
		hs.add(4);
		hs.add(6);
		
		System.out.println(hs);
		
		
		//addAll
		HashSet hs2 = new HashSet();
		
		hs2.addAll(hs);
		System.out.println(hs2); //[2, 4, 6]
		hs2.add(10);
		System.out.println(hs2); //[2, 4, 6, 10]
		
		//removeAll
		hs2.removeAll(hs);
		System.out.println(hs2); //[10]
	}
}
