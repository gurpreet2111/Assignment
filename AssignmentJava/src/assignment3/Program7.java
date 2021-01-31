// 7. Write a program with nested try blocks. 

package assignment3;

public class Program7 {

	public static void main(String[] args) 
	{
		
		int a[]={1,2,3,4,5};
		int b,c;
		try
		{
			b=16/a[0];
			try
			{
				//c=b/a[0];
				c=b/0;
				System.out.println(a[c]);
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println("invalid indecx");
			}
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("divide by zero index");
		}
		
		
		
		

	}

}
