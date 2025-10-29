
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class TimeExam2 {
	public static void main(String[] args) {
		LocalTime now = LocalTime.now();
//		LocalDateTime dt = LocalDateTime.of(2000, 10, 20, 30, 40);
		
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		String formatedNow = now.format(fm);
		System.out.println(formatedNow);
		System.out.println(now.getSecond());
		String fn = now.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 HH시 mm분 ss초"));
		System.out.println(fn);
		
		LocalDate isoDate =LocalDate.now();
		JapaneseDate jp = JapaneseDate.from(isoDate);
		
		System.out.println(jp);
		DateTimeFormatter jpFormatter = DateTimeFormatter.ofPattern("G yyyy년 MM월 DD일").withChronology(jp.getChronology());
	}
}
