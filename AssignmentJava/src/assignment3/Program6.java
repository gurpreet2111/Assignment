// 6. Write a program where a method declares that it throws ArithmeticException.


package assignment3;

public class Program6 {

	public static void main(String[] args) {
		
		try{
			int num1 = 10;
			int num2 =0;
			
			int result = num1/num2;
			System.out.println(result);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("catched arithmetic exception");
		}
		
		
		
	}

}
