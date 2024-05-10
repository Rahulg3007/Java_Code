package Generalization;

public class Test_Generalization
{
	public static void main(String[] args) 
	{
		System.out.println("Features of Jio Sim");
		Jio j = new Jio();
		j.calling();
		j.sms();
		j.internet();
		
		System.out.println("------------");
		
		System.out.println("Features of Airtel Sim");
		Airtel a = new Airtel();
		a.calling();
		a.sms();
		a.internet();
		
		System.out.println("------------");
		
		System.out.println("Features of Idea Sim");
		Idea i = new Idea();
		i.calling();
		i.sms();
		i.internet();
	}
	
}
