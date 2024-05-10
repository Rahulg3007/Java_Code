package Inheritance;

public class TestClass_Hirarchicle 
{
	public static void main(String[] args) 
	{
		Son1 s1 = new Son1();
		s1.property1();
		s1.property2();
		
		System.out.println("----------------------------");
		
		Son2 s2 = new Son2();
		s2.property1();
		s2.property3();
	}
}
