import java.time.LocalDate;
import java.time.ZoneId;

public class TimeExam1 {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate n = LocalDate.of(2025, 1, 1);
		
		System.out.println(now);
		System.out.println(n);
		
		LocalDate Seoul = LocalDate.now(ZoneId.of("Asia/Seoul"));
		LocalDate LA = LocalDate.now(ZoneId.of("America/LA"));
		LocalDate London = LocalDate.now(ZoneId.of("Europe/London"));
		LocalDate Toronto = LocalDate.now(ZoneId.of("America/Toronto"));
		
		System.out.println(Seoul);
		System.out.println(LA);
		System.out.println(London);
		System.out.println(Toronto);
		
		LocalDate pm = now.plusMonths(1);
		LocalDate pd = now.plusDays(1);
		
		int dayOfWeekValue = now.getDayOfWeek().getValue();
		System.out.println(dayOfWeekValue);
		
	}
}
