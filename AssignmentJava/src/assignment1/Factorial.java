/*1. Write a program to calculate the factorial of a number using a while loop.
The factorial of a positive number n is given by:
factorial of n (n!) = 1 * 2 * 3 * 4 * ... * n*/

package assignment1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int fact=1;
		
		int i=1;
		
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}

System.out.println("factorial is "+fact);
sc.close();
		
		

		
	}

}
