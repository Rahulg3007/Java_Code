package Inheritance;

public class TestClass
{
	public static void main(String[] args) 
	{
		WhatsApp_V2 w2 = new WhatsApp_V2(); //Single Level Inheritance
		w2.feature1();
		w2.feature2();
		w2.feature3();
		w2.feature4();
		
		System.out.println("--------------------");
		
		WhatsApp_V3 w3 = new WhatsApp_V3(); //Multiple Level Inheritance
		w3.feature1();
		w3.feature2();
		w3.feature3();
		w3.feature4();
		w3.feature5();
	}
}