package Exception_Handling;

public class Multiple_Exception 
{
	public static void main(String[] args) 
	{
		int ar[] = new int[3];
		
		try
		{
			ar[5]=10; // risky code
		}
		
		catch(ArithmeticException e) 
		{
			System.out.println("Arithmetic Exception Handled");
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Index Out Of Bound Exception Handled");
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index Out Of Bound Exception Handled");
		}
		
		catch(Exception e)
		{
			System.out.println("Generic Exception Handled");
		}
		
		System.out.println("Hello");
	}
}
