//5. Write a program to print the first 10 prime numbers. 


package assignment1;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int temp=0;
		for(int i=1;i<=25;i++)
		{
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0)
				{
					temp=temp+1;
				}
			}
			
		
		if(temp==0)
		{
			
			System.out.println(i);
			}
			
		
		else
		{
			temp=0;
		}

	}
}
}
