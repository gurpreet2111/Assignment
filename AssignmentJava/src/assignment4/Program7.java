//7. Sort ArrayList of Strings alphabetically. 

package assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Program7 {

	public static void main(String[] args) {
		
		
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("USA");
		ls.add("India");
		ls.add("Aus");
		ls.add("Germany");
		
		
		System.out.println("Sort ArrayList....");
		
		Collections.sort(ls);
		
		
        Iterator<String> itr=ls.iterator(); 
        
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
        
		

	}

}
