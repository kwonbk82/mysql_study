import java.util.EmptyStackException;
import java.util.Stack;

public class StackExam {
	public static void main(String[] args) {
		String expression = "(5+6)*(3-2";
		
		Stack st = new Stack();
		try {
			for(int i=0;i<expression.length();i++) {
				char ch = expression.charAt(i);
				if(ch == '(') {
					st.push("");
				}else if(ch == ')') {
					st.pop();
				}
			}
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			}else {
				System.out.println("닫는 괄호가 일치하지 않습니다");
			}
		}catch(EmptyStackException e){
			System.out.println("여는 괄호가 일치하지 않습니다");
		}
		
		
	}
}
