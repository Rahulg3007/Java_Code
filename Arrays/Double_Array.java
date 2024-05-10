package Arrays;

public class Double_Array 
{
	public static void main(String[] args) 
	{
		int ar[][] = new int[2][3];
		
		//  0  1  2
		//0 10 20 30
		//1 40 50 60
		
		ar[0][0] = 10;
		ar[0][1] = 20;
		ar[0][2] = 30;
		ar[1][0] = 40;
		ar[1][1] = 50;
		ar[1][2] = 60;
		
		System.out.println(ar.length);
		System.out.println(ar[1][2]);
		
		System.out.println("---print all data---");
		
		for(int i=0; i<=1; i++) //Outer for loop--->rows
		{
			
			for(int j=0; j<=2; j++)    //inner for loop --> colums
			{                  
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
}
