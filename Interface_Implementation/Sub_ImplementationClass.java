package Interface_Implementation;

public class Sub_ImplementationClass implements Super_Interface1,Super_Interface2
{
	public void m1()
	{
		System.out.println("Method m1 completed from Super interface 1");
	}
	
	public void m2()
	{
		System.out.println("Method m2 completed from Super interface 2");
	}
	
	public static void main(String[] args) 
	{
		Sub_ImplementationClass ic = new Sub_ImplementationClass();
		ic.m1();
		ic.m2();
	}
}
