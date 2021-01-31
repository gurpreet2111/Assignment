//6. Write a program to calculate the area of a triangle. Users will enter the values for
//base and height of the triangle. 

package assignment1;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a base of triangle: ");
		int base=sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter a height of triangle: ");
		int height= sc1.nextInt();
		
		double area = 0.5*(base*height);
		System.out.println("Area of a triangle is: "+area);
		
		sc.close();
		sc1.close();


	}

}
