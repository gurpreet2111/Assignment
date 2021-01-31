//4. Write a program to check whether the current year is leap year or not. Users will
//enter a year value. 

package assignment1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter a year ");
		
		int year = sc.nextInt();
		
		if((year%400==0) || ((year%4==0) && (year%100 !=0)))
				{
			System.out.println(year +" "+"is a leap year");
				}
		else
		{
			System.out.println("not a leap year");
		}
		sc.close();
				

	}

}
