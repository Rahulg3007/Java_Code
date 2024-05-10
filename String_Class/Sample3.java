package String_Class;

public class Sample3 
{
	public static void main(String[] args) 
	{
		
		String s1="My name is Java";
		
		System.out.println(s1.startsWith("My")); //true
		
		System.out.println(s1.endsWith("Python")); //false
		
		System.out.println(s1.substring(3, 10)); //name is
		
		System.out.println(s1.substring(3)); //name is Java
		
		System.out.println(s1.contains("is")); //true
		
		System.out.println(s1.charAt(5)); //m
		
		System.out.println(s1.indexOf('J')); //11
		
		System.out.println(s1.lastIndexOf('i')); //8
		
		System.out.println(s1.isBlank()); //false
		
		System.out.println(s1.replace("Java", "Python")); //My name is Python
		
	
	}
}
