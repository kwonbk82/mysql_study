package day1028;

class Member{
	String id;
	Member(String id){
		this.id=id;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(!(obj instanceof Member))return false;
			
		Member m=(Member) obj;
		return this.id== m.id;
		
		
	}
}
public class ObjectEquals2 {
	public static void main(String[] args) {
		Member m1 = new Member("red");
		Member m2 = new Member("red");
		Member m3 = new Member("blue");
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.equals(m3));
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
	}
}
