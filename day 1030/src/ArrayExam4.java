import java.util.ArrayList;

public class ArrayExam4 {
	public static void main(String[] args) {
		
		Item shirt = new Item("티셔츠",49900);
		Item pants = new Item("면바지",58900);
		Item sneakers = new Item("스니커즈",46900);
		
		ArrayList<Item> cart=new ArrayList<Item>();
		cart.add(sneakers);
		cart.add(pants);
		cart.add(shirt);
		int sum=0;
		for(Item i : cart) {
			i.print();
			sum+=i.price;
			System.out.println(sum+"원");
		}
	}
}
