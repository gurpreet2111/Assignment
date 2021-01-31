//3. Write a program to check “brown” is present in the string: A brown fox ran away fast 
package assignment3;

public class Program3 {

	public static void main(String[] args)
	{
		String s= "A brown fox ran away fast";
		
		if(s.contains("brown")){
			System.out.println("brown is present in the string");
		}
		else
		{
			System.out.println("brown is not present in the string");
		}

		
	}

}
