package day1106;

class MyThread1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=10;i>=0;i--) {
			System.out.println("t1 :"+i+" ");
		}
	}
}

class MyRunnable1 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.print(Thread.currentThread().getName());
		}
	}
}

public class ThreadExam3 {
	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		MyRunnable1 r1 = new MyRunnable1();
		Thread t2 = new Thread(r1);
		
//		스레드를 시작한다.
		t1.start();
		System.out.println("------------------------");
		t2.start();
	}
}
