import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExam2 {
	public static void main(String[] args) {
		Set set = new TreeSet(new Test());
		
		set.add(new Test("김블루",29));
		set.add(new Test("박명수",50));
		set.add(new Test("백승원",28));
		set.add(new Test("이레드",10));
		
		
	}
}

class Test implements Comparator{
	String name;
	int age;
	Test(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Test t1 = (Test) o1;
		Test t2 = (Test) o2;
		if(t1.age != t2.age) {
			return t1.age - t2.age;
		}
		return t1.name.compareTo(t2.name);
	}
}