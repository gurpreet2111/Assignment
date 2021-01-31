//2. Write a program to print fibonacci series (10 values).
//A series where the next term is the sum of previous two terms. The first
//two terms of the Fibonacci sequence is 0 followed by 1.
//The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21

package assignment1;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		
		int a=0,b=1,c;
		
		for(int i=1;i<=10;i++)
		{
			c=a+b;
					
			System.out.print(c +  " ");
			
			a=b;
			b=c;
		}
		

	}

}
