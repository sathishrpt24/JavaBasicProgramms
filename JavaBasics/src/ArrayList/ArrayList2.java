package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
	
	private ArrayList <Integer> arl;
	
	public static void main(String[] args) {
		
		ArrayList2 a1 = new ArrayList2();
		
		a1.arrayLi();
		a1.arrayItr();
		
	}
	
	public  void  arrayLi() {
		
		 arl = new ArrayList<Integer>();
		
		arl.add(5);
		
		System.out.println("The value Stroed nin Arl is: " + arl);
		
		arl.add(6);
		
		arl.add(7);
		
		arl.add(8);
		
		arl.add(9);
		
		arl.add(8);
		
		arl.add(9);
		
		System.out.println("The value Stroed nin Arl are: " + arl);
		
				
	}
	
	public void arrayItr() {
		
		Iterator<Integer> itr = arl.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println("The value in Array List is: "+itr.next());
		}
	}

}
