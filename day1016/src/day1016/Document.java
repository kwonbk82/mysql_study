package day1016;

public class Document {
	String name;
//	int docuNo;
	static int count =0;
	{
		++count;
		
	}
	Document(){
		++count;
		this.name="제목없음";
		System.out.println("제목없음"+count+".txt");
	}
	Document(String name){
		this.name=name;
		System.out.println(this.name);
	}
	public static void main(String[] args) {
		
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
		
	}
}
