package String_Class;

public class Sample1 
{
	public static void main(String[] args)
	{
		
//		//only declaration
//		String s3;
//		
//		//declaration & intialization
//		String s4="abc";
		
		
		
		String s1="abc";
		System.out.println(s1);
		
		s1=s1+"d";     //    abc + d  = abcd
		System.out.println(s1);
		
		s1=s1+"xyz";    // "abcd" + "xyz" = abcdxyz
		System.out.println(s1);
		
		
		//Object creation of string
		
		//1. Without using new keyword
		String s3="abc";
		
		//2. Using new keyword
		String s4=new String("xyz");
		
		
	}
}
