/*// 5. Write a program to throw NumberFormatException and handle it appropriately with a proper
message.
If you pass invalid input to parseInt(str), this exception will be thrown.
*/
package assignment3;

public class Program5 {

	public static void main(String[] args) {
		
		String a = "50a";
		String b = "60";
		
		try{
			int x = Integer.parseInt(a);
			int y = Integer.parseInt(b);
			int z = x+y;
			System.out.println("sum = "+z);
		}
		catch(NumberFormatException e)
		{
			System.out.println("catch number format exception for invalid integers");
		}

		
		
	}

}
