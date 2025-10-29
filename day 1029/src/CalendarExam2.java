import java.util.Calendar;

public class CalendarExam2 {
	public static void main(String[] args) {
		final String[] WEEK = {"","일","월","화","수","목","금","토"};
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		System.out.println(date1);
		date1.clear();
		System.out.println(date1);
		
		date1.set(1996,10, 31);
//		날짜간의 차이를 계산하는 방법
		long diff = (date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
		System.out.println(diff+"초 지났습니다");
		System.out.println(diff/(60*60*24));
	}
}
