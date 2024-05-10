package Interface_Implementation;

public class ImplementationClass implements InterfaceClass
{
	public void m1()
	{
		System.out.println("Method m1 completed in implementation class");
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		ImplementationClass ic = new ImplementationClass();
		ic.m1();
	}
}
