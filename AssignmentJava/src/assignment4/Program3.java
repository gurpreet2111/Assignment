//3. Check if a particular key exists in HashMap. 

package assignment4;

import java.util.HashMap;

public class Program3 {

	public static void main(String[] args) 
	{
		
		HashMap<String, Integer> mp = new HashMap<String, Integer>();
		
		mp.put("India", 1);
		mp.put("Paris", 2);
		mp.put("Japan", 3);
		mp.put("USA", 4);
		
		
		if(mp.containsKey("USA"))
		{
			System.out.println("key is exist");
		}
		else
		{
			System.out.println("key is not exist");

		}

	}

}
