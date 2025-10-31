import java.util.ArrayList;
import java.util.Scanner;

public class MemberMenu {
	Scanner scan = new Scanner(System.in);
	private int menu;
	boolean flag = true; 
	private String menuStr = "---------------\n"+" 1.추가 2.검색 3.수정 4.삭제 5. 전체출력 6. 데이터초기화 7.종료";

	public void menuProcess(ArrayList<Member> data) {
		int idx = 0;
		while(true) {
			System.out.println(menuStr);
			menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				data.add(infoInput());
				break;
			case 2:
				idx = search(data);
				if(idx>=0) printMember(data.get(idx));
				break;
			case 3:
				editMember(data);
				break;
			case 4:
				delMember(data);
			case 5:
				for(int i=0;i<data.size();i++) {
					System.out.println(data.get(i));
				}
			case 6:
				delAll(data);
			case 7:
				System.out.println("종료합니다");
				flag = false;
				break;
				default:
					System.out.println("잘못된 메뉴입니다");
					
			}
		}
	}
	public Member infoInput() {
		System.out.println("이름 > ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("전화번호 > ");
		String tel = scan.nextLine();
		System.out.println("주소 > ");
		String addr = scan.nextLine();
		
		return new Member(name,tel,addr);
	}
	public int search(ArrayList<Member> data) {
		scan.nextLine();
		System.out.println("이름 > ");
		String name = scan.nextLine();
		for(int i=0;i<data.size();i++) {
			if(name.equals(data.get(i).getName())) {
				return i;
			}
		}
		System.out.println("일치하는 사람이 없습니다.");
		return -1;
	}
	public void printMember(Member m) {
		System.out.println(m);
	}
	public void editMember(ArrayList<Member> data) {
		int idx = search(data);
		if(idx>=0) {
			System.out.println("변경된 전화번호 > ");
			String tel = scan.nextLine();
			System.out.println("변경된 주소 > ");
			String addr = scan.nextLine();
			
			data.set(idx, new Member(data.get(idx).getName(),tel,addr));
		}
	}
	public void delMember(ArrayList<Member> data) {
		int idx = search(data);
		data.remove(idx);
	}
	public void delAll(ArrayList<Member> data) {
		data.removeAll(data);
	}
}
