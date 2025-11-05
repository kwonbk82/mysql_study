import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain {
	List<Employee> list = new ArrayList<>(); 
	private Scanner scan;
	public EmployeeMain(Scanner scan) {
		this.scan=scan;
	}
//	1
	public void addEmployee() {
		System.out.println("name : ");
		String name = scan.nextLine();
		
		System.out.println("age : ");
		int age = Integer.valueOf(scan.nextLine());
		
		System.out.println("salary : ");
		int salary = Integer.valueOf(scan.nextLine());
		
		Employee e = new Employee(name, age, salary);
		list.add(e);
		System.out.println("등록 완료");
	}
	
//	2
	public void findByName() {
		System.out.println("name : ");
		String name = scan.nextLine();
		boolean found = false;
		for(Employee e : list) {
			if(e.getName().equals(e)) {
				System.out.println(e);
				found=true;
				break;
			}
		}
		if(!found) {
			System.out.println("직원이 없습니다");
		}
	}
//	3
	public void displayAll() {
		for(Employee e : list) {
			System.out.println(e);
		}
	}
	
//	4
	public void sortSalary() {
		for(Employee e : list) {
			System.out.println(e);
		}
	}

}
