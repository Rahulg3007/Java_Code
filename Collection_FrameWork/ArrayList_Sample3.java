package Collection_FrameWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Sample3 
{
	public static void main(String[] args) 
	{
		String ar[] = {"Dog", "Cat", "Cow"};
		
		for(String value:ar)
		{
			System.out.println(value);
		}
		
		//Converting Array into ArrayList
		ArrayList al = new ArrayList(Arrays.asList(ar));
		
		System.out.println(al); //[Dog, Cat, Cow]
	}
}
