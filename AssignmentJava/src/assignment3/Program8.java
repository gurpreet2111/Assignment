//8. Write a program to re-throw an exception. (throw inside catch block)
package assignment3;

public class Program8 {
	
	
	void divide()
	{
		int x,y,z;
		try
		{
			x=6;
			y=0;
			z=x/y;
			System.out.println(z);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception caught in divide method and rethrow");
			throw e;
			
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("main method");
		Program8 r = new Program8();
		try
		{
			r.divide();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Rethrow exception in main method");
			System.out.println(e);
		}
		
		
			
		}
		

	}


