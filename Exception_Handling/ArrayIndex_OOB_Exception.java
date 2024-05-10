package Exception_Handling;

public class ArrayIndex_OOB_Exception 
{
	public static void main(String[] args) 
	{
		int ar[] = new  int[2];
		
		try
		{
			ar[3]=10; //Risky Code
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBound Exception Handle");
			ar[1]=10;
			System.out.println(ar[1]);
		}
		
		
	}
}
