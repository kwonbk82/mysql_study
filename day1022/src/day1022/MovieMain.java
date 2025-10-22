package day1022;

public class MovieMain {
	public static void main(String[] args) {
		
		int sum=0;
		Movie[] movies = {new Action("spiderman"),new Horror("twilight"),new Comedy("Thor")};
		for(Movie m : movies) {
			sum +=m.discounted();
		}
		System.out.println(sum);
}
	
}
