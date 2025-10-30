import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CollectionsExam2 {
	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList();
		for(int i=1;i<=45;i++) {
			lotto.add(i);
		}
		Collections.shuffle(lotto);
		int[] num = new int[6];
		for(int i=0;i<num.length;i++) {
			num[i]=(int)lotto.remove(0);
		}
		System.out.println(Arrays.toString(num));
	}
}
