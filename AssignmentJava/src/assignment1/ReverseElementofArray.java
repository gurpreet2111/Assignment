//8. Write a program to reverse the elements of an array where the array size as well as the
//array values are entered by the user
package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseElementofArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter an element of an array");
		
		Scanner sc1= new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();

		sc1.close();
		
		System.out.println("Reverse the element of an array");
		
		for(int i=arr.length-1;i>=0;i--)
		{
	System.out.println(arr[i]);
		}
	}

}
