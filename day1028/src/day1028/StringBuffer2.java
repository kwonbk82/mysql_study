package day1028;

//import jdk.internal.org.jline.terminal.TerminalBuilder.SystemOutput;

public class StringBuffer2 {
	public static void main(String[] args) {
		String a = "hello";
		String b = a;
		
		a+="world";
		System.out.println(a+b);
		System.out.println("____________________");
		StringBuffer c = new StringBuffer("hi");
		StringBuffer d =c;
		c.append("world");
		System.out.println(c);
		System.out.println(d);
		System.out.println("____________________");
		
		long beforeTime = System.currentTimeMillis();
		String str="";
		for(int i=0;i<1000000;i++) {
			str+="a";
		}
		long afterTime = System.currentTimeMillis();
		long diffTime = afterTime-beforeTime;
		
		System.out.println("시간차이"+diffTime+"ms");
	}
}
