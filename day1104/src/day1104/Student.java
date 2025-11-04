package day1104;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal() {
		return kor+eng+math;
	}
	public double getAvg() {
		return (double) getTotal()/3;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("이름 : %s | 국어 : %d | 영어 : %d | 수학 : %d | 총점 : %d | 평균 : %f |", name,kor,eng,math,getTotal(),getAvg());
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
}
