package Polymorphism;

public class Method_Overriding2 extends Method_Overriding1
{
	public void m1()
	{
		System.out.println("Method m1 is overiden");
	}
	
	public void m2()
	{
		System.out.println("Method m2 is overiden");
	}
	
	
	
	
	public static void main(String[] args) 
	{
		Method_Overriding2 m = new Method_Overriding2();
		m.m1();
		m.m2();
	}
}
