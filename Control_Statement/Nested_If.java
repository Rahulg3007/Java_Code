package Control_Statement;

public class Nested_If 
{
	public static void main(String[] args) 
	{
		int age = 16;
		int weight = 40;
		
		if(age>=18)
		{
			if(weight>=45)
			{
				System.out.println("Eligible for blood donation");
			}
			else
			{
				System.out.println("Not eligible for blood donation");
			}
		}
		else
		{
			System.out.println("Not eligible for blood donation");
		}
	}
}
