package day1014;

public class StudentMain {
	public static void main(String[] args) {
		Student st;
		st = new Student();
		
		st.name = "강일용";
		st.age = 22;
		st.addr = "김해시";
		
		System.out.println(st.name);
		System.out.println(st.age);
		System.out.println(st.addr);
		System.out.println("_______________________________");
		st.studentInfo();
		System.out.println("_______________________________");

		Student s1;
		s1 = new Student();

		s1.name = "강해린";
		s1.age = 22;
		s1.addr = "서울시";
		s1.studentInfo();
		

	}
}
