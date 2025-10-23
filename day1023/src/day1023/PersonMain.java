package day1023;

import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Student s = new Student("김다정", 5, "서울시 관악구", "동양서울대학교", "전산정보학과", 201506251);
		Scanner scan = new Scanner(System.in); 
		System.out.println("이름 : "+s.name+
                "나이 : "+s.age +
                "주소 : "+s.addr +
                "학교 : "+s.college +
                "학과 : "+s.major +
                "학번 : "+s.stuNum);
		for(int i=0;i<s.score.length;i++) {
			System.out.println((i+1)+"학기 학점 > ");
			s.score[i]=scan.nextDouble();
		}
		System.out.println("____________________");
		System.out.println("8학기 학점 평균 : "+s.average()+"점" );
	}
}
