package com.peisia.kiosk.catcafe;

import java.util.ArrayList;
import java.util.Scanner;

public class Kioskobj {

	public static ArrayList<Order> basket = new ArrayList<>();
	public static ArrayList<Product> products_food = new ArrayList<>();
	public static ArrayList<Product> products_drink = new ArrayList<>();
	public static ArrayList<Product> products_syrup = new ArrayList<>();
	public static ArrayList<Product> products_dessert = new ArrayList<>();
	public static ArrayList<Product> products_cat = new ArrayList<>();
	public static ArrayList<Product> products_book = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	public static String cmd;

	public static void productLoad() {

		products_food.add(new Product("라면", 3500));
		products_food.add(new Product("김밥", 3000));

		products_drink.add(new Product("아이스 아메리카노", 3500));
		products_drink.add(new Product("콜라", 1500));

		products_syrup.add(new Product("+옵션없음"));
		products_syrup.add(new Product("+헤이즐넛", 500));
		products_syrup.add(new Product("+바닐라", 500));
		products_syrup.add(new Product("+카라멜", 500));

		products_dessert.add(new Product("마카롱", 3500));
		products_dessert.add(new Product("샌드위치", 5500));

		products_cat.add(new Product("츄르", 500));
		products_cat.add(new Product("참치캔", 1500));

		products_book.add(new Product("만화대여", 500));
	}

}
