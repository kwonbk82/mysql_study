package day1017;

public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){}
	
	Student(String name,int ban,int no, int kor, int eng, int math){
		this.name=name;
		this.ban=ban;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	int getTotal() {
		 return kor+eng+math;
	}
	float getAverage() {
		return getTotal()/3f;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "김풍";
		s1.ban = 1;
		s1.no =1;
		s1.kor = 60;
		s1.eng = 89;
		s1.math = 30;
		
		Student s2 = new Student("에드워드리",2,2,20,90,80);

		System.out.printf("%s의 총점은 %d점이고 평균은 %f점입니다",s2.name,s2.getTotal(),s2.getAverage());

		System.out.printf("%s의 총점은 %d점이고 평균은 %f점입니다",s1.name,s1.getTotal(),s1.getAverage());
	}
	
	
}
