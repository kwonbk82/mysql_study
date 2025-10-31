import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExam1 {
	static Queue q = new LinkedList();
	static final int MAX_SIZE = 5;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("help를 입력하면 도움말이 출력됩니다");
		while(true) {
			System.out.println("명령어 >> ");
			String input = scan.nextLine();
			
			if(input.equalsIgnoreCase("q")) {
				System.out.println("종료합니다");
				System.exit(0);
			}else if(input.equalsIgnoreCase("help")) {
				System.out.println("help - 도움말 출력");
				System.out.println("q or Q - quit program");
				System.out.println(" history - show your latest record : "+MAX_SIZE);
			}else if(input.equalsIgnoreCase("history")) {
				save(input);
				LinkedList list = q;
				for(int i =0;i<q.size();i++) {
					System.out.println((i+1)+"."+list.get(i));
					}
					
					}else {
						save(input);
					}
				
				}
			}
		}
	public void save(String input) {
		if(input !=null && !input.equals("")) {
			q.offer(input);
			
			if(q.size()>MAX_SIZE) {
				q.remove();
	}
	}
}
