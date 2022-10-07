package sep27pgm.ex;
class StudentEdu{
	int sid;
	String sname;
	float sfees;
	//constructor with argument
	public StudentEdu(int sid, String sname, float sfees) {
		this.sid=sid; //this refers to the present object
		this.sname=sname;
		this.sfees=sfees;
	}
	
	void display() {
		System.out.println("Student id="+sid);
		System.out.println("Student name="+sname);
		System.out.println("Student fees="+sfees);
	}
}

public class ConstructorArg {

	public static void main(String[] args) {
		StudentEdu sob1=new StudentEdu(1,"Pavithra",7654.6f);
		StudentEdu sob2=new StudentEdu(2,"Aniket",8654.6f);
		StudentEdu sob3=new StudentEdu(3,"Pranathi",8254.6f);
		
		sob1.display();
		sob2.display();
		sob3.display();
		

	}

}
