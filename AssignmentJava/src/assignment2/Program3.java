//3. Is 13 a prime number? 

package assignment2;

public class Program3 {

	public static void main(String[] args) {
		
		int num =15;
		int temp=0;
		
		for(int i=2;i<=num-1;i++)
		{
			if(num%2==0)
			{
				temp=temp+1;
			}
		}
		
		if(temp>0)
		{
			System.out.println("not a prime number");
		}
		else
		{
			System.out.println("number is prime");
		}

	}

}
