/*10. Write a program to print this output using a two-dimensional array.
Triangle Array
0
00
000
0000
00000
000000
0000000
00000000
000000000
0000000000*/
package assignment1;

public class PrintPatttern {

	public static void main(String[] args) 
	{
		int a[][] = new int[10][10];
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();

		}
		
		
				

	
}
}
