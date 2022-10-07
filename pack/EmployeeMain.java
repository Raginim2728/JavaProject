package product.pack;

class Employee{
	float salary;
	Employee(){
		salary=20000;
		System.out.println("Employee constructor");
		
	}
}class Programmer extends Employee{
	float bonus,tsal;
	public Programmer() {
		bonus=800;
		System.out.println("Programmer constructor");
		
	}
	void totalSalary() {
		tsal=salary+bonus;
		System.out.println("programmer total salary="+tsal);
	}
}
public class EmployeeMain {

	public static void main(String[] args) {
		Programmer ob=new Programmer();
		ob.totalSalary();
	}

}
