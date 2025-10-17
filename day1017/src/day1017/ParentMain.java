package day1017;

public class ParentMain {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.name="parent";
		p.printInfo();
		
		Child c =new Child();
		c.name = "child";
		c.hobby = "테트리스";
		c.printInfo();
	}
	
}
