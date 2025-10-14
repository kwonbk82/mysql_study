package day1014;

public class PointMain {
	public static void main(String[] args) {
		Point [] pArr = new Point[5];
		for(int i =0;i<pArr.length;i++){
			pArr[i] = new Point();
			pArr[i].x = i+1;
			pArr[i].y = i*2;
			System.out.println("x : "+pArr[i].x);
			System.out.println("y : "+pArr[i].y);
		}
	}
}
