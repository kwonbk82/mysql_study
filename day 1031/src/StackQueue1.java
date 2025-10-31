import java.util.LinkedList;
import java.util.Stack;

public class StackQueue1 {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		System.out.println(st.search("0"));
	}
}
