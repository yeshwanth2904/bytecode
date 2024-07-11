package constructor;

public class empolyee  {
empolyee(String name, int age, int i) {
		super();
	}
private double salary;
public void Employee(String name,int age,double salary) {

	this.salary=salary;
}
public void display() {
	System.out.println("my salary is "+salary);
}
	public static void main(String[] args) {
Empolyee employee = new empolyee("bob",25,5000);
employee.introduce();
employee.displaysalary();
	}

}
