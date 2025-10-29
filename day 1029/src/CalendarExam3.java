import java.util.Calendar;

public class CalendarExam3 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.set(2025,9,31);
		date.add(Calendar.DATE, 1);
		date.add(Calendar.MONTH, -6);
//		roll은 다른 필드에 영향 안준다
		date.roll(Calendar.DATE, 31);
	}
}
