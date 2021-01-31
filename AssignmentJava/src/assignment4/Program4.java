//4. Convert keys of a map to a list. 

package assignment4;

import java.util.ArrayList;
import java.util.HashMap;

public class Program4 {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> mp = new HashMap<String, Integer>();
		
		mp.put("India", 1);
		mp.put("Paris", 2);
		mp.put("Japan", 3);
		mp.put("USA", 4);
		
	      ArrayList<String> keyList = new ArrayList<String>(mp.keySet());
	      
	      System.out.println(keyList);


	}

}
