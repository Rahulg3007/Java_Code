package Generalization;

public class Airtel implements SimCard
{
	public void calling()
	{
		System.out.println("8000min");
	}
	
	public void sms()
	{
		System.out.println("120/Day");
	}
	
	public void internet()
	{
		System.out.println("500MB/Day");
	}
}
