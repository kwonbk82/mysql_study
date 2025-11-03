package day1103;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableExam1 {
	public static void main(String[] args) {
		String[] arr = {"banana","Grape","grape", "Apple","apple","orange"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr,String.CASE_INSENSITIVE_ORDER);
		Arrays.sort(arr,new Descending());
		System.out.println(Arrays.toString(arr));
	}
}
class Descending implements Comparator{
	public int compare(Object o1,Object o2) {
		// TODO Auto-generated method stub
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable) o1;
			Comparable c2 = (Comparable) o2;
			
			int result =  c1.compareTo(c2);
			if(result>0) {
				return -1;
			}else if(result<0) {
				return 1;
			}else {
				return 0;
			}
			
		}
		return -1;
	}
}
