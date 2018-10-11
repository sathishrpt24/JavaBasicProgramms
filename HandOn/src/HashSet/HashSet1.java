package HashSet;

import java.util.HashSet;

public class HashSet1 {
	
	private HashSet<Integer> set;
	
	public static void main(String[] args) {
		
		HashSet1 s1 = new HashSet1();
		
		s1.hashsetread();
		
	}
	
	public void hashsetread() {
		
		set = new HashSet<Integer>();
		
		set.add(5);
		set.add(5);
		set.add(5);
		set.add(5);
		set.add(5);
		set.add(5);
		
		System.out.println("The value of set is: " +set);
			
	}

}
