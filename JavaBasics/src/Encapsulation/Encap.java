package Encapsulation;

public class Encap {

	private int rollno;
	private String name;
	private float avg;

	public  Encap(int rollno, String name, Float Avg) {
		this.rollno = rollno;
		this.name = name;
		this.avg = Avg;
		System.out.println("Constructor executed successfully");
	}
	public int getrollNo() {

		return this.rollno;
	}

	public String getname() {

		return this.name;
	}

	public float getavgo() {
		return this.avg;
	}

	public void setrollno(int newRoll) {

		this.rollno = newRoll;
	}

	public void setname(String Newname) {

		this.name = Newname;
	}
	
	public void setAvg(int newAvg) {

		this.avg = newAvg;
	}
	
	public void student_details() {
		
		String Student_Details = String.format("The student details are: Roll"
				+ " no: %1$d Name: %2$s Avg: %3$f", this.rollno,this.name,this.avg);
		System.out.println(Student_Details);
	}
}
