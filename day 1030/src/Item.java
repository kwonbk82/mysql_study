
public class Item {
	String name;
	int price;
	
	public Item(String name,int price) {
		this.name=name;
		this.price=price;
	}
	public void print() {
		System.out.printf("Item{name : %s, price : %d}",name,price);
	}
}
