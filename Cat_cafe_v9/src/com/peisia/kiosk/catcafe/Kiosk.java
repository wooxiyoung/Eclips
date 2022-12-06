package com.peisia.kiosk.catcafe;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {

	Kiosk_drink kiosk_drink = new Kiosk_drink();
	Kiosk_dessert kiosk_dessert = new Kiosk_dessert();
	Kiosk_cat kiosk_cat = new Kiosk_cat();
	Kiosk_book kiosk_book = new Kiosk_book();

	void run() {
		Kioskobj.productLoad();
		Disp.Dis();
		a: while (true) {

			System.out.println("1.식사/2.음료/3.디저트/4.고양이간식/5.만화대여/y.주문하기");
			Kioskobj.cmd = Kioskobj.sc.next();

			switch (Kioskobj.cmd) {
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
					Disp.Line();
					System.out.println("해당 주문을 마치시겠습니까?");
					Disp.Line();
					System.out.println("장바구니에 담긴 상품 갯수: " + Kioskobj.basket.size());
					System.out.println("장바구니에 담긴 상품: ");

					for (Order x : Kioskobj.basket) {
						System.out.println(x.selectedproduct.name);
					}
					int sum = 0;
					Disp.Line();
					for (Order y : Kioskobj.basket) {
						sum = sum + y.selectedproduct.price;
					}
					System.out.println("장바구니 총 금액: " + sum + "원");
					Disp.Line();
					System.out.println("y.결제하기 x.되돌아가기");
					Kioskobj.cmd = Kioskobj.sc.next();
					switch (Kioskobj.cmd) {
					case "y":
						g: while (true) {

							System.out.println("결제완료");
							System.out.println("영수증을 출력하시겠습니까?");
							System.out.println("1.네/2.아니요");
							Kioskobj.cmd = Kioskobj.sc.next();
							switch (Kioskobj.cmd) {
							case "1":
								System.out.println("아래 영수증을 챙겨주세요");
								System.out.println("프로그램 종료");
								break;
							case "2":
								System.out.println("프로그램 종료");
								break g;
							}
							break;
						}
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