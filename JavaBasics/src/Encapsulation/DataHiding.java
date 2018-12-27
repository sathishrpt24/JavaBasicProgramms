package Encapsulation;

public class DataHiding {
	
	private int Cellno;
	private String classname;
	
	public void newClass() {
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encap encap = new Encap(2009508024,"Sathish",45.78f);
		encap.student_details();
		//System.out.println(encap.rollno);
		System.out.println(encap.getname()+":"+encap.getavgo()+" "+encap.getrollNo());
		
		DataHiding dh = new DataHiding();
		
	}

}