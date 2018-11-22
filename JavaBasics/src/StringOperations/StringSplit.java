package StringOperations;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 ="Hello How are you";
		String[] s2 = s1.split("\\s");
		
		for (String w : s2) {
			
			System.out.println(w);
			
		}

	}

}
