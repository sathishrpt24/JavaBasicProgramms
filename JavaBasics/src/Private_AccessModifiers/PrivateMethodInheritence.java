package Private_AccessModifiers;

public class PrivateMethodInheritence extends PrivateModifier {
	
	public static void main(String args[]) {
		
		PrivateMethodInheritence pmi = new PrivateMethodInheritence();
		pmi.c = 10;
		pmi.public_modifiers();
		//Try to access private methods
	}

}
