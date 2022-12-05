package practice;

public class Product {
	//1.변수들
	String name;
	int price;
	
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
	//2.함수들 (메인 말고)
	void info() {
		System.out.println("상품명:"+name+" 가격:"+price+"원");
	}
}
