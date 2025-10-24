
public class RectangleMain {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(100, 20);
		Rectangle r2 = new Rectangle(40, 30);
		
		int result =r1.compareTo(r2);
		if(result==-1) {
			System.out.println("r2가 더 큽니다");
		}else if(result == 0) {
			System.out.println("same");
		}else {
			System.out.println("r1 is bigger");
		}
	}
}
