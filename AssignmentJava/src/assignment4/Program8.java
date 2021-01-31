//8. Get Set view of keys from HashTable.
package assignment4;

import java.util.Enumeration;
import java.util.Hashtable;

public class Program8 {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht = new Hashtable<>();
		
		ht.put(1, "One");
		ht.put(2, "two");
		ht.put(3, "three");
		ht.put(4, "four");
		
		Enumeration<Integer> e = ht.keys();
	      
	      while (e.hasMoreElements()) {
	         System.out.println(e.nextElement());		
		
		}

	}
}
