package Methods;

public class Test1 
{
	public static void m1()
	{
		System.out.println("static method of same class");
	}
	
	public void m2()
	{
		System.out.println("non static method of same class");
	}
	
	public static void main(String[] args) 
	{
		m1();
		Test1 t1 = new Test1();
		t1.m2();
		
		Test2.m3();
		Test2 t2 = new Test2();
		t2.m4();
	}
}
