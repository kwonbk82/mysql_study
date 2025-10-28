package day1027;

public class ExceptionExam3 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		int i;
		try {
			for (i=0;i<3;i++) {
				arr[i]=i;
			}
			for(i=0;i<3;i++) {
				System.out.println(arr[i]);
			}
			i = 4/2;
			
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("Error 109");
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			System.out.println("should do");
		}
		
	}
}
