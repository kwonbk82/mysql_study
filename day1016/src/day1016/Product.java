package day1016;

public class Product {
	int serialNo;
	static int count =0;
	
	{
		++count;
		serialNo = count;
	}
	Product(){
		
	}
	Product(String name){
		
	}
}
