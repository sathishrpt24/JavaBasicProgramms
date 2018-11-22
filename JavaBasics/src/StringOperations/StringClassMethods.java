package StringOperations;

public class StringClassMethods {

	public static void main(String[] args) {
		
		String s1 = "JaVA";
		String s2 = "Bascis";
		
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toLowerCase());

		System.out.println(s1.toUpperCase());
		System.out.println(s2.toUpperCase());
		
		// Trim function
		
		String s3 = " TestString ";
		
		System.out.println("Before Trim: "+s3.length());
		
		String d4 = s3.trim();
		
		System.out.println("After trim: "+d4.length());

		// Startswith
		
		System.out.println("String s3 Starts with whitespace? "+ s3.startsWith(" "));
		
		// endwith
		
		System.out.println("String s3 end  with whitespace? "+ s3.endsWith(" "));
		
		// Replace
		
		String s5 = "Java is OOPS language. Java basics for beginners. Java basics completed";
		
		String s6 = s5.replace("Java","Python");
		
		System.out.println(s6);
	}

}
