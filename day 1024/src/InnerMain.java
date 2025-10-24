
class OuterClass{
	int value = 10;
	class InnerClass{
		int value = 20;
		public void myMethod() {
			int value =30;
			System.out.println("this.value : "+this.value);
			System.out.println("OuterClass.this.value : "+OuterClass.this.value);
			System.out.println("value : "+value);
		}
	}
}
public class InnerMain {
	public static void main(String[] args) {
		
	}
}
