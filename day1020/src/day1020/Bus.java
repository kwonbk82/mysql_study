package day1020;

public class Bus {
	private int num;
	private int count;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {

		if(count>=0 && count<=45) {
			this.count = count;
		}
	}
	
	void setNumCount(int num,int count) {
		if(count>=0 && count<=45) {
			this.num=num;
			this.count = count;
			System.out.println("설정이 완료되었습니다");
		}else {
			System.out.println("정원이 초과되었습니다");
		}
	}
	
	public void show() {
		System.out.println("차량번호 : "+num);
		System.out.println("탑승인원 : "+count);
	}
}
