package Abstract_Concrete;

public class ConcreteClass extends AbstractClass
{
	public void m2()
	{
		System.out.println("abstract method m2 completed in Concrete Class");
	}
	
	public static void main(String[] args) 
	{
		ConcreteClass c = new ConcreteClass();
		c.m1();
		c.m2();
	}
}
