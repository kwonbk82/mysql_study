import java.util.Calendar;

public class DateExam1 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("%d년 %d월 %d일",year,month,day);
		
		int week = now.get(Calendar.WEEK_OF_MONTH);
		System.out.println(week);
		switch(week) {
		case 1:
			System.out.println("sun");
			break;
		case 2:
			System.out.println("mon");
			break;
		case 3:
			System.out.println("tue");
			break;
		case 4:
			System.out.println("wen");
			break;
		case 5:
			System.out.println("thu");
			break;
		case 6:
			System.out.println("fri");
			break;
		case 7:
			System.out.println("sat");
			break;
		}	
		int amPm = now.get(Calendar.AM_PM);
		if(amPm==0){
			System.out.println("good morning");
		}else {
			System.out.println("good afternoon");
		}
	}
}
