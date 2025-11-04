package day1104;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class StudentMain {
	
		ArrayList<Student> arr = new ArrayList<>();
		Scanner scan;
		
		public StudentMain(Scanner scan) {
			// TODO Auto-generated constructor stub
			this.scan =scan;
		}
		
//		1
		public void addStu() {
			System.out.println("이름 : ");
			String name = scan.next();
			System.out.println("국어 : ");
			int kor = Integer.parseInt(scan.nextLine());
			System.out.println("영어 : ");
			int eng = Integer.parseInt(scan.nextLine());
			System.out.println("수학 : ");
			int math = Integer.parseInt(scan.nextLine());
			Student s = new Student(name, kor, eng, math);
			arr.add(s);
			System.out.println("학생 추가 완료");
		}
//		2
		public void searchStu() {
			System.out.println("검색할 학생 이름 : ");
			String name = scan.nextLine();
			
			Student s = findStuByName(name);
			if(s !=null) {
				System.out.println(s);
			}else {
				System.out.println("일치하는 학생이 없음");
			}

		}
//		3
		public void listStu() {
			if(arr.isEmpty()) {
				System.out.println("등록된 학생이 없습니다");
				return;
			}
			System.out.println("전체 학생 목록");
			for(Student s : arr) {
				System.out.println(s);
			}
		}
		
		private Student findStuByName(String name) {
			for(Student s : arr) {
				if(s.getName().equals(name)) {
					return s;
				}
			}
			return null;
		}
	
}
