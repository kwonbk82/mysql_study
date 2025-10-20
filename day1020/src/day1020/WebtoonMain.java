package day1020;

public class WebtoonMain {
	public static void main(String[] args) {
	Webtoon wt1 = new Webtoon("나혼자만 레벨업","판타지","나혼자");
	Webtoon wt2 = new Webtoon("신의탑","액션","SIU");
	Webtoon wt3 = new Webtoon("이태원 클라스","드라마","박서준");
//	wt1.print();
//	wt2.print();
//	wt3.print();
	System.out.println("총 웹툰 수 :"+Webtoon.getCount());
	
	Webtoon[] webtoons = {wt1,wt2,wt3};
//	for (int i =0;i<webtoons.length;i++) {
//		webtoons[i].print();
//	}
	for (Webtoon w : webtoons) {
		w.print();
	}
}
}
