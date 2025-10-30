import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayExam1 {
	public static void main(String[] args) {
		Integer[] array = new Integer[100];
		System.out.println(array.length);
		System.out.println("________________");
		
		ArrayList list = new ArrayList(100);
		
		System.out.println(list.size());
		list.add(10);
		Collections.addAll(list,1,2,3,4,5);
		Collections.rotate(list, 2);
		Collections.swap(list,0, 2);
		Collections.sort(list);
		Collections.binarySearch(list,3 );
		Collections.fill(list,3 );
		List newList = Collections.nCopies(list.size(),2);
		System.out.println("new List : "+newList);
		System.out.println("max : "+Collections.max(list));
		System.out.println("min : "+Collections.min(list));
		
//		공통된게 없으면 true
		System.out.println(Collections.disjoint(list, newList));
		
		System.out.println(list);

		System.out.println(list.size());
		
		ArrayList list1 = new ArrayList(10);
//		arraylist 에는 객체타입만 저장이 가능하지만 값이 기본형으로 오면 자동으로 형변환되어 저장됨 
		list1.add(5);
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list1.add(7);
		System.out.println(list1);
	}
}
