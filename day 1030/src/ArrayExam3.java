import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Collections;

public class ArrayExam3 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
	
		System.out.println(al);
		al.get(0);
		al.remove(1);
		System.out.println(al);

		for(int i=0;i<al.size();i++) {
			al.remove(i);
		}

		if(al.contains(al)) {
			int idx = al.indexOf();
			System.out.println();
		}
	}
}
