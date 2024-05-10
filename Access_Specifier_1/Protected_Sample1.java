package Access_Specifier_1;

public class Protected_Sample1 
{
	protected int a = 10;
	
	protected void m1()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		Protected_Sample1 p = new Protected_Sample1();
		p.m1();
	}
}
