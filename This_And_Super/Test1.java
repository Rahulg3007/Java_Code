package This_And_Super;

public class Test1 extends Test2
{
	//int a = 30;  Global variable from super class Test2
	
	int a = 10; //Global variable from same class
	
	public void m1()
	{
		int a = 20; //local variable from same class
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) 
	{
		Test1 t1 = new Test1();
		t1.m1();
	}
}
