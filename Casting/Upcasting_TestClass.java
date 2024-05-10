package Casting;

public class Upcasting_TestClass 
{
	public static void main(String[] args) 
	{
		
		//creating object of son(SubClass) class with the reference of father(SuperClass) class
		father f = new son(); //Upcasting
		f.car();
		f.mobile();
		
	}
}
