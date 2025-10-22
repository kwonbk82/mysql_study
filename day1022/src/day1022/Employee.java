package day1022;

public abstract class Employee {
	String name;
	int age;
	String addr;
	String department;
	
	public Employee(String name, int age, String addr, String department) {
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.department = department;
	}
//	public abstract int salary();
	void printInfo() {
		System.out.println("name : "+name);
		System.out.println("age : "+age);
		System.out.println("address : "+addr);
		System.out.println("part : "+department);
	};
}
