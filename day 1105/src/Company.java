import java.util.ArrayList;
import java.util.Scanner;

public class Company {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EmployeeMain em = new EmployeeMain(scan);
		while(true) {
			System.out.println("----------------");
			System.out.println("1. 직원추가");
			System.out.println("2. 이름으로 직원 검색");
			System.out.println("3. 모든 직원 보기");
			System.out.println("4. 월급 높은 순으로 정렬");
			System.out.println("5. 종료");
			System.out.println("---------------");
			System.out.println(">> 선택 :");
			
			String input = scan.nextLine();
			switch(input) {
			case"1":
				em.addEmployee();
				break;
			case "2":
				em.findByName();
				break;
			case "3":
				em.displayAll();
				break;
			case "4":
				em.sortSalary();				
				break;
			case "5":
				System.out.println("Quit program");
//				break;
				return;
		}
		
	}
	}
}
