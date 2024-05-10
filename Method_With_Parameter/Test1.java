package Method_With_Parameter;

public class Test1 
{
	 public static void addition(int a , int b)
	 {
		 System.out.println("addition:"+" "+(a+b));
	 }
	 
	 public void subtraction(int a, int b)
	 {
		 System.out.println("subtraction:"+" "+(a-b));
	 }
	 
	 public static void main(String[] args) 
	 {
		 addition(20,30);
		 
		 Test1 t1 = new Test1();
		 t1.subtraction(30, 20);
		 
		 Test2.multiplication(20, 30);
		 
		 Test2 t2 = new Test2();
		 t2.division(30, 20);
	 }
}
