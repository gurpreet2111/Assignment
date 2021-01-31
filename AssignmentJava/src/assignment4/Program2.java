// 2. Reverse an Arraylist. 

package assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class Program2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		
		System.out.println("Before ");
		System.out.println(numbers);
		Collections.reverse(numbers);
		
		System.out.println("After reverse");
		System.out.println(numbers);
		
		
	}
	

}
