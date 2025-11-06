package day1106;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExam1 {
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try (in= new FileInputStream("파일경로");
				out= new FileOutputStream("파일경로")){
			int buffer;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		finally {
//			if(in !=null) {
//				in.close();
//			}
//			if(out !=null) {
//				out.close();
//			}
//		}
		
	}
}
