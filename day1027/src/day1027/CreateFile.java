package day1027;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
	public static void main(String[] args) {
		try{
			Scanner s = new Scanner(System.in);
		
		System.out.println("file name > ");
		
		File f = createFile(s.nextLine()+".txt");
		System.out.println(f.getName()+"created");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	static File createFile(String name) {
		try {
		if(name==null||name.equals("")) {
			throw new Exception("invalid name");
		}
		}catch(Exception e) {
			name="제목없음.txt";
		}finally {
		File f = new File(name);
		createNewFile(f);
		return f;
		}
	}
	static void createNewFile(File f) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
