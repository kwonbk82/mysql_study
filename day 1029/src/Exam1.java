import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도 입력 > ");
		int y = scan.nextInt();
		System.out.println("월 입력 > ");
		int m  = scan.nextInt();
		
		Calendar sd = Calendar.getInstance();
		Calendar ed = Calendar.getInstance();
		
		sd.set(y, m-1,1);
		ed.set(y, m,1);
		ed.add(Calendar.DATE,-1);
		
		int StartDayOfWeek = sd.get(Calendar.DAY_OF_WEEK);
		int endDay = ed.get(Calendar.DATE);
		System.out.println("    "+y+"년"+m+"월");
		System.out.println("SU MO TU WE TH FR SA");
		for(int i=1; i<StartDayOfWeek; i++ ) {
			System.out.print("  ");
		}
		for(int i=1; i<endDay;i++) {
			System.out.print(i);
		}
	}
}
