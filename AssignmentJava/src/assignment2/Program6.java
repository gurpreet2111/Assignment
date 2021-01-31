//6. Find the duplicates in an array 
package assignment2;

public class Program6 {

	public static void main(String[] args) 
	{
		
		int numbers[]={12, 32, 12, 45, 65, 93, 0, 23, 45, 6};
		
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]==numbers[j])
				{
					System.out.println(numbers[j]);
				}
			}
		}
		

	}

}
