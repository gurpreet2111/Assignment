//3. Write a program to sort the elements of an array in ascending order. 

package assignment1;

import java.util.Arrays;

public class SortElementofArray {

	public static void main(String[] args) 
	{
		
		String[] arr={"Chennai","Banglore","Mumbai","Hyderabad"};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));

	}

}
