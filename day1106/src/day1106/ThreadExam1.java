package day1106;

class MyThread extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=10;i>=0;i--) {
			System.out.println(i+" ");
		}
	}
}

public class ThreadExam1 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		
//		스레드를 시작한다.
		t.start();
	}
}
