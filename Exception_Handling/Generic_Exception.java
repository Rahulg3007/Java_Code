package Exception_Handling;

public class Generic_Exception 
{
	public static void main(String[] args) 
	{
		int ar[] = new int[3];
		
		try
		{
			ar[5]=10; // risky code
		}
		
		catch(Exception e)
		{
			System.out.println("Generic Exception Handled");
			ar[2]=10;
			System.out.println(ar[2]);
		}
	}
}
