/*4. Find the sum of digits
Example:
int n = 1234;
output: 10 */
package assignment2;

public class Program4 {

	public static void main(String[] args) 
	{
		
		int num =1234;
		
		int sum =0;
		int rem;
		
		while(num>0)
		{
			rem = num%10;
			sum = sum+rem;
			num=num/10;
		}
		
		System.out.println("sum of digits is "+ sum);
		

	
		

	}

}
