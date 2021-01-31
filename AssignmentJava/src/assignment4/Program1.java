//1. Find duplicate characters with their occurrences count using HashMap. 

package assignment4;

import java.util.HashMap;
import java.util.Iterator;

public class Program1 {
	
	static void duplicatechar(String str)
	{
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(hm.get(c) !=null)
			{
				hm.put(c, hm.get(c)+1);
			}
			else
			{
			hm.put(c, 1);
			}
			
		}
		//System.out.println(hm);
		
		Iterator<Character> itr = hm.keySet().iterator();
		while(itr.hasNext())
		{
			char c = itr.next();
			if(hm.get(c)>1)
			{
				System.out.println(c + " = " + hm.get(c));
			}
			
		}

	}

	public static void main(String[] args) 
	{
		
		duplicatechar("testingg");
	}

}
