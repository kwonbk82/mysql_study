
public class Rectangle implements Comparable{
	public int width=0;
	public int height=0;
	
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
	}
	public int getArea() {
		return width*height;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "("+width+", "+height+")";
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		Rectangle rec = (Rectangle) obj;
		if(this.getArea()<rec.getArea()) {
			return -1;
		}else if(this.getArea()==rec.getArea()) {
			return 0;
		}else {
			return 1;
		}

	}
}
