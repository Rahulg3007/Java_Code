package Control_Statement;

public class Else_If_statement 
{
	public static void main(String[] args) 
	{
		int marks = 35;
		
		if(marks>=75)
		{
			System.out.println("Destination");
		}
		else if(marks>=65)
		{
			System.out.println("First Class");
		}
		else if(marks>=55)
		{
			System.out.println("Second Class");
		}
		else if(marks>=45)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
