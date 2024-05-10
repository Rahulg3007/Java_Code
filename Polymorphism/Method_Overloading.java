package Polymorphism;

public class Method_Overloading
{
	public void m1(int a , int b)
	{
		System.out.println(a+b);
	}
	
	public void m1(String a, String b)
	{
		System.out.println(a+" "+b);
	}
	
	public static void main(String[] args) 
	{
		Method_Overloading m = new Method_Overloading();
		m.m1(10, 20);
		m.m1("Rahul", "Gavhane");
	}
}
