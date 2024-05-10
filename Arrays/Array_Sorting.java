package Arrays;

import java.util.Arrays;

public class Array_Sorting 
{
	
	public static void main(String[] args) 
	{
		int ar[] = {10,40,20,30};
		
		System.out.println("Original Order");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("----------");
		
		Arrays.sort(ar);
		System.out.println("Ascending Order");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
		
		System.out.println("----------");
		
		System.out.println("Descending Order");
		
		for(int i=ar.length-1; i>=0; i--)
		{
			System.out.println(ar[i]);
		}
	}
}
