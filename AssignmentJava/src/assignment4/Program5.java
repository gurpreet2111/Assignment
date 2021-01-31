//5. Copy all elements of a HashSet to an Object array. 

package assignment4;

import java.util.HashSet;

public class Program5 {

	public static void main(String[] args) 
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(21);
		hs.add(22);
		hs.add(8);
		hs.add(9);
		hs.add(11);
		
		System.out.println(hs);
		
		System.out.println("Copy all elements of a HashSet to an Object array");
		
		Object[] obArr = hs.toArray();
		
		for(Object ob : obArr)
		{
			System.out.println(ob);
		}
		

	}

}
