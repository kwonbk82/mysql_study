import java.awt.datatransfer.SystemFlavorMap;
import java.util.*;


public class LinkedList11 {
	public static void main(String[] args) {
		List<String> array = new ArrayList<String>();
		List<String> linked = new java.util.LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			array.add(0, String.valueOf(i));
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
		
	}
}
