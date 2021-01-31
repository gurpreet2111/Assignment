//2. Write a program to check if a given string is a palindrome or not.
// Palindrome example: trurt 

package assignment3;

public class Palindrome {

	public static void main(String[] args)
	{
		
		String s="trurt";
		
		String rev = "";
		
		for(int i=s.length()-1; i >=0; i--)
		{
			rev = rev + s.charAt(i);
		}
		
		if(s.equals(rev))
		{
			System.out.println("Palindrome string");
		}
		
		else
		{
			System.out.println("not a palindrome string");
		}
	}

}
