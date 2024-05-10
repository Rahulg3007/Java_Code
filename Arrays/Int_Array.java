package Arrays;

public class Int_Array
{
	public static void main(String[] args) 
	{
		int ar[] = new int[5];
		
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 30;
		ar[3] = 40;
		ar[4] = 50;
		
		System.out.println(ar.length); //4
		
		System.out.println(ar[3]);
		
		System.out.println("---Print all array---");
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.println(ar[i]+" ");
		}
		
		System.out.println("------------------");
		
		//Array declaration and initialization in single line
		
		int ar1[] = {20,40,60,80};
		
		System.out.println(ar1.length); //3
		
		System.out.println("---Print all array---");
		
		for(int i=0; i<=ar1.length-1; i++)
		{
			System.out.println(ar1[i]);
		}
		
	}
	
}
