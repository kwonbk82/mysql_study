package day1106;

class Counter {
	private int value=0;
//	스레드가 작업하는 동안 다른 스레드가 실행될수 없도록 함
	public synchronized void increase() {
		value++;
	}
	public void decrease() {
		value--;
	}
	public void print() {
		System.out.println(value);
	}
}

class CounterThread extends Thread{
	Counter counter;
	CounterThread(Counter c){
		this.counter=c;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i=0;
		while(i<2000) {
			counter.increase();
			counter.decrease();
			
			if(i%40 == 0) {
				counter.print();
			}
			try {
				sleep((int) (Math.random()*2));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
}
public class ThreadExam4 {
	public static void main(String[] args) {
		Counter c = new Counter();
		Thread t1 = new CounterThread(c);
		Thread t2 = new CounterThread(c);
		Thread t3 = new CounterThread(c);
		Thread t4 = new CounterThread(c);
		
		new CounterThread(c).start();
		new CounterThread(c).start();
		
	}
}
