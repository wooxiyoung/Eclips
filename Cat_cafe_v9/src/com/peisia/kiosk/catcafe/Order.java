package com.peisia.kiosk.catcafe;

public class Order {
	public Product selectedproduct;
	public int option = 0;


	public Order(Product selectedproduct) {
		this.selectedproduct = selectedproduct;
	}

	public Order(Product selectedproduct, int option) {
		this.selectedproduct = selectedproduct;
		this.option = option;
	}

}
