package day1104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam1 {
	public static void main(String[] args) {
		String[] data = {"a", "b","b", "c", "d", "d", "d", "s","s", "k"};
		Map map = new HashMap();
		for(int i=0;i<data.length;i++) {
			if(map.containsKey(data[i])) {
				int value = (int) map.get(data[i]);
				map.put(data[i], value+1);
			}else {
				map.put(data[i], 1);
			}
		}
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			int value = (int)entry.getValue();
			System.out.println(entry.getKey()+" : "+value+" "+printBar('#',value));
		}
	}
	public static String printBar(char ch,int value) {
		char[] bar = new char[value];
		for(int i=0;i<bar.length;i++) {
			bar[i]=ch;
		}
		return new String(bar);
	}
	
}
