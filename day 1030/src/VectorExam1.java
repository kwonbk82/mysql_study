import java.util.List;
import java.util.Vector;

public class VectorExam1 {
	public static void main(String[] args) {
		List<Board> list = new Vector<>();
		list.add(new Board("제목1","내용1","작성자1"));
		list.add(new Board("제목2","내용2","작성자2"));
		list.add(new Board("제목3","내용3","작성자3"));
		
		for(int i=0;i<list.size();i++) {
			Board b = list.get(i);
			System.out.println(b.title+"\t"+b.content+"\t"+b.writer);
		}
	}
}
