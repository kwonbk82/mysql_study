package day1023;

public class Student extends Person{
	String college;
	String major;
	int stuNum;
	double score[];
	
	Student(String name,int age,String addr,String college,String major,int stuNum){
		super(name,age,addr);
		this.college=college;
		this.major=major;
		this.stuNum=stuNum;
		score=new double[8];
	}
	double average(){
		double sum=0;
		for(double s : score) {
			sum += s;
		}
		return sum/score.length;
	}
	
}
