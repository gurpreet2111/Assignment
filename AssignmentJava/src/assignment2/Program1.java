/*1. Java Program to Calculate average of numbers using Array
Example:
values [] = 1, 2,3 4, 5
average = 3 */

package assignment2;

public class Program1 {

	public static void main(String[] args) 
	{
		double[] num = {21,2.9,56,90.6,99};
		
		double total=0,avg=0;
		
		for(int i=0;i<num.length;i++)
		{
			total = total+num[i];
		}
		
		avg = total/num.length;
		
		System.out.println("Average of numbers: "+ avg);
		
		

	}

}
