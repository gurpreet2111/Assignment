// 6. Get highest and lowest value stored in TreeSet 

package assignment4;

import java.util.TreeSet;

public class Program6 {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
	ts.add(21);
	ts.add(15);
	ts.add(68);
	ts.add(10);
	ts.add(16);
	
	System.out.println("Highest value "+ts.pollLast());
	
	System.out.println("Lowest vale "+ts.pollFirst());

	}

}
