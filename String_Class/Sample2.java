package String_Class;

public class Sample2 
{
	public static void main(String[] args) 
	{
		
		String s1="String";
		String s2="ABCD";
		String s3="abcd";
		
		System.out.println(s1.length());    //8
		System.out.println(s1.toUpperCase()); //STRING
		System.out.println(s1.toLowerCase()); //string
		
		System.out.println(s2.equals(s3));   //false              //case sensitive
		System.out.println(s2.equalsIgnoreCase(s3));     //true    //not a case sensitive
		
	}
}
