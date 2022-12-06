package com.peisia.kiosk.catcafe;

public class Product {

	String name;
	int price;

	Product(String x, int y) {
		this.name = x;
		this.price = y;
	}

	Product(String x) {
		this.name = x;
	}
	
	
	
	void info() {
		System.out.println("상품명: " + name + " 가격: " + price);
	}
}
