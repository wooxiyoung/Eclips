package com.peisia.kiosk.catcafe;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {

	Kiosk_drink kiosk_drink = new Kiosk_drink();
	Kiosk_dessert kiosk_dessert = new Kiosk_dessert();
	Kiosk_cat kiosk_cat = new Kiosk_cat();
	Kiosk_book kiosk_book = new Kiosk_book();
	
	public static ArrayList<Product> basket = new ArrayList<Product>();
	public static Scanner sc = new Scanner(System.in);
	public static Product food1 = new Product("라면", 3500);
	public static Product food2 = new Product("김밥", 3000);
	public static Product drink1 = new Product("아이스 아메리카노", 3500);
	public static Product drink2 = new Product("콜라", 1500);
	public static Product dessert1 = new Product("마카롱", 3500);
	public static Product dessert2 = new Product("샌드위치", 5500);
	public static Product cat1 = new Product("츄르", 500);
	public static Product cat2 = new Product("참치캔", 1500);
	public static Product book = new Product("만화대여", 500);
	public static String cmd;

	void run() {

		a: while (true) {
			Disp.Dis();
			System.out.println("1.식사/2.음료/3.디저트/4.고양이간식/5.만화대여/y.주문하기");
			cmd = sc.next();

			switch (cmd) {
			case "1":
				Kiosk_food.food();
				break;

			case "2":
				kiosk_drink.drink();
				break;
			case "3":
				kiosk_dessert.dessert();
				break;

			case "4":
				kiosk_cat.cat();
				break;

			case "5":
				kiosk_book.book();
				break;
			case "y":
				f: while (true) {
					System.out.println("해당 주문을 마치시겠습니까?");
					System.out.println("장바구니에 담긴 상품 갯수: " + basket.size());
					System.out.println("장바구니에 담긴 상품: ");

					for (Product x : basket) {
						System.out.println(x.name);
					}
					int sum = 0;
					for (Product y : basket) {
						sum = sum + y.price;
					}
					System.out.println("장바구니 총 금액: " + sum);
					System.out.println("y.결제하기 x.되돌아가기");
					cmd = sc.next();
					switch (cmd) {
					case "y":
						System.out.println("결제완료");
						break a;
					case "x":
						System.out.println("화면을 되돌아갑니다");
						break f;
					}
				}
				break;
			}
		}
	}
}