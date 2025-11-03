package day1103;

public class Student {
	int num;
	String name;
	
	Student(int num,String name){
		this.num = num;
		this.name=name;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu = (Student) obj;
			return (num ==stu.num&& name.equals(stu.name));
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return num+name.hashCode();
	}
}
