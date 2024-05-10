package Variables;

public class Test1 
{
	int a = 10; //global variable
	
	public void m1()
	{
		int b = 20; //local variable
		System.out.println(a);
		System.out.println(b);
	}
	
	public void m2(int c, int d) //Local Variable
	{
		System.out.println(c+d);
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		Test1 t1 = new Test1();
		t1.m1();
		t1.m2(10, 20);
		
		System.out.println(Test2.a); //static globle variable of different class
		
		Test2 t2 = new Test2();
		System.out.println(t2.b); //non static globle variable of different class
	}
}
