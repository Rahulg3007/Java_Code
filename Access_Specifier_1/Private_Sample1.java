package Access_Specifier_1;

public class Private_Sample1 
{
	private int a =10;
	
	private void m1()
	{
		int b = 20;
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		Private_Sample1 ps1 = new Private_Sample1();
		System.out.println(ps1.a);
		
		ps1.m1();
	}
}
