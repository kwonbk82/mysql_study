package day1028;

class User implements Cloneable{
	String name;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
public class Clone1 {
	public static void main(String[] args) {
		User user = new User();
//		얕은 복사
		user.name = "blue";
		User copy = user;
		
		System.out.println(user.hashCode());
		System.out.println(copy.hashCode());
		System.out.println(user.equals(copy));
		
//		깊은 복사
		try {
		User user2 = new User();
		user2.name = "red";
		User copy2 = (User) user2.clone();
		System.out.println(user2.hashCode());
		System.out.println(copy2.hashCode());
		System.out.println(user2.equals(copy2));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(user.getClass());
	}
}
