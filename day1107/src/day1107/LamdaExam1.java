package day1107;

interface MaxTest{
	public abstract int max(int a, int b);
}
public class LamdaExam1 {
	public static void main(String[] args) {
//		MaxTest mt = new MaxTest() {
//				public int max(int a,int b) {
//					return a>b ? a : b;
//				}
//		};
		MaxTest mt =  (a,b) ->	a>b ? a : b;
			

		System.out.println(mt.max(5, 2));
		}
		
	}

