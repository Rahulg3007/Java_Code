package Arrays;

public class String_Array 
{
	public static void main(String[] args) 
	{
		String ar [] = new String[3];
		
		ar[0] = "Java";
		
		ar[1] = "Python";
		
		ar[2] = "JavaScript";
		
		System.out.println(ar.length); //3
		
		System.out.println(ar[1]); //Python
		
		System.out.println("---Print all data---");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]+" ");
		}
		
		System.out.println("-----------");
		
		////Array declaration and initialization in single line
		
		String ar1[] = {"Java", "Python", "JavaScript"};
		
		System.out.println(ar1.length);
		
		System.out.println("----Print all data---");
		
		for(int i=0; i<=ar1.length-1; i++)
		{
			System.out.println(ar1[i]+" ");
		}
	}
}
