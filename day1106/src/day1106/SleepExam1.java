package day1106;

class SleepThread extends Thread{
	int num;
	
	public SleepThread(int num) {
		// TODO Auto-generated constructor stub
		this.num=num;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.print(num+", ");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class SleepExam1 {
	public static void main(String[] args) throws InterruptedException {
		SleepThread t1 = new SleepThread(1);
		SleepThread t2 = new SleepThread(2);
		SleepThread t3 = new SleepThread(3);
		
		t1.setPriority(5);
		t2.setPriority(10);
		t3.setPriority(1);
		
		System.out.println("start");
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("finish");
	}
	
}
