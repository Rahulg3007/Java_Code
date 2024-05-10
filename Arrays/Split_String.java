package Arrays;

public class Split_String 
{
	public static void main(String[] args) 
	{
		String s = "My Name Is Java";
		
		String ar[] = s.split(" ");
		
		System.out.println(ar.length);
		
		System.out.println("---print all data---");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]);
		}
	}
}
