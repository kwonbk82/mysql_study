package day1110;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;

public class Reservation {
	private long id;
	private long movieId;
	private String mTitle;
	private String seatNum;
	
	private static final File file = new File("reservations.txt");
	
	public Reservation(long movieId,String mTitle,String seatNum) {
		this(Instant.now().toEpochMilli(),movieId,mTitle,seatNum);
		// TODO Auto-generated constructor stub
	}

	public Reservation(long id,long movieId,String mTitle,String seatNum) {
		this.id=id;
		this.movieId=movieId;
		this.mTitle=mTitle;
		this.seatNum=seatNum;
		// TODO Auto-generated constructor stub
	}
	
	public static ArrayList<Reservation> findByMovieId(String movieIdStr) throws IOException{
		ArrayList<Reservation> reservations = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		
		while((line=br.readLine()) != null) {
			String[] temp = line.split(", ");
			if(movieIdStr.equals(temp[1])) {
				long id =Long.valueOf(temp[0]);
				long movieId = Long.valueOf(temp[1]);
				String movieTitle = temp[2];
				String seatName = temp[3];
				
				Reservation r = new Reservation(id, movieId, movieTitle, seatName);
				reservations.add(r);
				continue;
			}
			
		}
		br.close();
		return reservations;

	}
	
	
	
	private String toFileString() {
		return String.format("%d,%d,%s,%s", id, movieId, mTitle, seatNum);
	}
	
//	예매확인
	public static Reservation findById(String reservationId) throws IOException {
		Reservation r = null;
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		
		while((line=br.readLine()) != null) {
			String[] temp = line.split(", ");
			if(reservationId.equals(temp[0])) {
				r=new Reservation(Long.valueOf(temp[0]), Long.valueOf(temp[1]), temp[2], temp[3]);
			}
			break;
		}
		br.close();
		return r;
	}
	
	public static Reservation cancel(String reservationId) throws IOException {
		Reservation canceled = null;
		BufferedReader br = new BufferedReader(new FileReader(file));
		String text = "";
		String line = null;
//		line에 저장하는 과정에서 String으로 바뀜
		while((line=br.readLine()) != null) {
			String[] temp = line.split(", ");
			if(reservationId.equals(temp[0])) {
				canceled = new Reservation(Long.valueOf(temp[0]), Long.valueOf(temp[1]), temp[2], temp[3]);
				continue;
			}
	
			text +=line+"/n";
		}
		br.close();
		FileWriter fw = new FileWriter(file);
		fw.write(text);
		fw.flush(); 
		fw.close();
		return canceled;
	}
	public void save() throws IOException {
		FileWriter fw = new FileWriter(file, true);
		fw.write(this.toFileString()+"\n");
		fw.flush(); 
		fw.close();
		return canceled;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("영화 : %s, 좌석번호 : %s", mTitle,seatNum);

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getMovieId() {
		return movieId;
	}

	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}

	public String getmTitle() {
		return mTitle;
	}

	public void setmTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}
	
	
}
