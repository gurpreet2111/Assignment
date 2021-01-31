//7. Write a program to print the sum of the first 20 natural numbers. 

package assignment1;

public class NaturalNumber {

	public static void main(String[] args) 
	{
		
		int sum=0;
		
		for(int i=1;i<=20;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum of first 20 natural number is: "+sum);

	}

}
