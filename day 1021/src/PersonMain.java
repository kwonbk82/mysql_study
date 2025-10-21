
public class PersonMain {
	public static void personInfo(Person person) {
		System.out.println("name : "+person.name);
		person.walk();
		
		if(person instanceof Student stu) {
			System.out.println("No : "+stu.studentNo);
			stu.study();
		}
		
	}
	public static void main(String[] args) {
		Person p1 = new Person("david");
		personInfo(p1);
		Student s1 = new Student("davidson", 11);
		s1.study();
		personInfo(s1);
	}
}
