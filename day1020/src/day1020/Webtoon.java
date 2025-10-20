package day1020;

public class Webtoon {
	private String title;
	private String genre;
	private String author;
	private static int count=0;
	
	public Webtoon(String title,String genre,String author) {
		this.title =  title;
		this.genre = genre;
		this.author = author;
		Webtoon.count++; //statci일때는 클래스 이름 붙여서 써줌
	}
	public static int getCount() {
		return count;
	}
	public void print() {
		System.out.printf("Webtoon {제목 : %s, 장르 : %s, 작가 : %s}"+"\n",title, genre,author);	

	}
}
