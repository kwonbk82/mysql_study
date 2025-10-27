package day1027;

public class ThrowExam1 {
	public static void main(String[] args) {
		try {
			Exception e = new Exception("일부러");
			throw e;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
