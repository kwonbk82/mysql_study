package day1028;

public class StringBuffer1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("StringBuffer");
		sb.append(" : ");
		sb.append("Hello Java");
		System.out.println(sb);
		
		String str = sb.toString();
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("java");
		sb2.insert(0, "hello");
		System.out.println(sb2);
		System.out.println(sb2.reverse());
	}
}
