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

public class Pattern {

	public static void main(String[] args) 
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
