package day1110;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Movie {
	private long id;
	private String title;
	private String genre;
	private static final File file = new File("movies.txt");
	
	public Movie( String title, String genre) {
		this(Instant.now().getEpochSecond(),title,genre);
	}
	
	public Movie(long id, String title, String genre) {
		this.id = id;
		this.title = title;
		this.genre = genre;
	}
	
	public void save() throws IOException {
		FileWriter fw = new FileWriter(file,true);
		fw.write(this.toFileString()+"\n");
		fw.flush(); 
		fw.close();
	}
	
	public static ArrayList<Movie> findAll() throws IOException{
		ArrayList<Movie> movies = new ArrayList<>();
//		FileReader(): 한글자씩 읽어오므로 느려터짐 / read 메서드 : 문자단위, readLine : 줄전체
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		while((line=br.readLine()) != null) {
			String[] temp = line.split(", ");
			Movie m = new Movie(Long.valueOf(temp[0]),temp[1],temp[2]);
			movies.add(m);
		}
		br.close();
		return movies;
	}
	private String toFileString() {
		return String.format("%d, %s,%s", id,title,genre);

	}
	
	public static void delete(String movieIdStr) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String text = "";
		String line = null;
		while((line=br.readLine()) != null) {
			String[] temp = line.split(", ");
			if(movieIdStr.equals(temp[0])) {
				continue;
			}
			text +=line+"/n";
		}
		br.close();
		FileWriter fw = new FileWriter(file);
		fw.write(text);
		fw.flush(); 
		fw.close();
		
	}
	public static Movie findById(String movieIdStr) throws IOException{
		Movie movie = null;
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;

		while((line=br.readLine()) != null) {
			String[] temp = line.split(", ");
			if(movieIdStr.equals(temp[0])) {
				movie=new Movie(Long.valueOf(temp[0],temp[1],temp[2]));
				break;
			}
		}
		br.close();
		return movie;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[%d]: %s(%s)", id,title,genre);
	}
}
