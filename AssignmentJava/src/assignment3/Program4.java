//4. Write a program to convert String to a character array and character array to String. 

package assignment3;

public class Program4 {

	public static void main(String[] args) 
	{
		
		String s = "Good morning";
		System.out.println("String to character array");
		
		char[] ch = s.toCharArray();
		
		for(char c : ch)
		{
			System.out.println(c);
		}
		
		System.out.println("character array to string");
		
		String str = new String(ch);
		System.out.println(str);
		
		

	}

}
