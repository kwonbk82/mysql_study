class A{
		A(){
			System.out.println("Aclass");
		}
	}
	class B{
		B(){
			System.out.println("classB");
		}
	}
public class TypeTest1 {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
	}
	
}
