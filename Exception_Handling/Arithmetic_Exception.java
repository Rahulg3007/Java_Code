package Exception_Handling;

public class Arithmetic_Exception 
{
	public static void main(String[] args) 
	{
		int a = 10;
		
		int b = 0;
		
		int c;
		
		try
		{
			c=a/b;  //Arithmetic Exception
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic Exception Handled");
			
			c=a/2;
		}
		
		System.out.println(c);
	}
}
