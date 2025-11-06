package day1106;

class MyRunnable implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.print(i+" ");
		}
	}
}

public class ThreadExam2 {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		
//		스레드를 시작한다.
		t.start();
	}
}
