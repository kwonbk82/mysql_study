package day1022;

public class Regular extends Employee{
	int salary;
	Regular(String name, int age, String addr, String department){
		super(name,age,addr,department);
	}
	 void setSalary(int salary) {
		this.salary=salary;
	}
	 void printInfo() {
		 super.printInfo();
		 System.out.println("regular");
		 System.out.println("salary : "+salary);
	 }
}
