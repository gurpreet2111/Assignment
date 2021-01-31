/*1. Write a program to print the occurrence of each character in the String
“DevLabs Alliance Training”*/ 

package assignment3;

import java.util.HashMap;

public class Program1 {

	public static void main(String[] args) 
	{
		
		String s = "DevLabs Alliance Training";
		
		String string = s.replaceAll("\\s", "");
		int count;
		char ch;
		HashMap<Character,Integer> hashmap = new HashMap<Character,Integer>();
		
		for(int i=0; i<string.length();i++)
		{
			ch = string.charAt(i);
			
			if(hashmap.containsKey(ch))
			{
				count=hashmap.get(ch);
				count++;
				hashmap.replace(ch, count);
			}
			else
			{
				hashmap.put(ch, 1);
			}
		}
		
		for(Character key :hashmap.keySet())
		{
			System.out.println(key + " = " +hashmap.get(key));
		}
		
		

	}

}
