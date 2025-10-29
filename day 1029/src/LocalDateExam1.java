import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class LocalDateExam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("년도 입력 > ");
		int y = scan.nextInt();
		System.out.println("월 입력 > ");
		int m  = scan.nextInt();
		
		LocalDate sd = LocalDate.of(y, m, 1);
		LocalDate ed = sd.plusMonths(1).minusDays(1);
		DayOfWeek firstDayOfWeek = sd.getDayOfWeek();
		
		int startDayOfWeek = firstDayOfWeek.getValue()+1;
		int endDay = ed.getDayOfMonth();
	}
}
