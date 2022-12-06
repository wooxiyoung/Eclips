package com.peisia.kiosk.catcafe;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {

	ArrayList<Product> basket = new ArrayList<Product>();
	Scanner sc = new Scanner(System.in);
	Product food1 = new Product("라면", 3500);
	Product food2 = new Product("김밥", 3000);
	Product drink1 = new Product("아이스 아메리카노", 3500);
	Product drink2 = new Product("콜라", 1500);
	Product dessert1 = new Product("마카롱", 3500);
	Product dessert2 = new Product("샌드위치", 5500);
	Product cat1 = new Product("츄르", 500);
	Product cat2 = new Product("참치캔", 1500);
	Product book = new Product("만화대여", 500);
	String cmd;

	void run() {

		a: while (true) {
			System.out.println("고양이카페 키오스크");
			System.out.println("해당 화면을 클릭해주세요");
			System.out.println("1.식사/2.음료/3.디저트/4.고양이간식/5.만화대여/y.주문하기");
			cmd = sc.next();

			switch (cmd) {
			case "1":
				b: while (true) {
					System.out.println("식사 화면을 선택하셨습니다.");
					food1.info();
					food2.info();
					System.out.println("1.라면/2.김밥/x.되돌아가기");
					cmd = sc.next();
					switch (cmd) {
					case "1":
						System.out.println("라면을 선택하셨습니다");
						basket.add(food1);
						break;
					case "2":
						System.out.println("김밥을 선택하셨습니다");
						basket.add(food2);
						break;
					case "x":
						System.out.println("화면을 되돌아갑니다");
						break b;
					}
				}
				break;

			case "2":
				c: while (true) {
					System.out.println("음료 화면을 선택하셨습니다.");
					drink1.info();
					drink2.info();
					System.out.println("1.아이스 아메리카노/2.콜라/x.되돌아가기");
					cmd = sc.next();
					switch (cmd) {
					case "1":
						System.out.println("아이스 아메리카노를 선택하셨습니다");
						basket.add(drink1);
						break;
					case "2":
						System.out.println("콜라를 선택하셨습니다");
						basket.add(drink2);
						break;
					case "x":
						System.out.println("화면을 되돌아갑니다");
						break c;
					}
				}
				break;
			case "3":
				d: while (true) {
					System.out.println("디저트 화면을 선택하셨습니다.");
					dessert1.info();
					dessert2.info();
					System.out.println("1.마카롱/2.샌드위치/x.되돌아가기");
					cmd = sc.next();
					switch (cmd) {
					case "1":
						System.out.println("마카롱을 선택하셨습니다");
						basket.add(dessert1);
						break;
					case "2":
						System.out.println("샌드위치을 선택하셨습니다");
						basket.add(dessert2);
						break;
					case "x":
						System.out.println("화면을 되돌아갑니다");
						break d;
					}
				}
				break;

			case "4":
				e: while (true) {
					System.out.println("고양이간식을 선택하셨습니다.");
					cat1.info();
					cat2.info();
					System.out.println("1.츄르/2.참치캔/x.되돌아가기");
					cmd = sc.next();
					switch (cmd) {
					case "1":
						System.out.println("츄르를 선택하셨습니다");
						basket.add(cat1);
						break;
					case "2":
						System.out.println("참치캔을 선택하셨습니다");
						basket.add(cat2);
						break;
					case "x":
						System.out.println("화면을 되돌아갑니다");
						break e;
					}
				}
				break;

			case "5":
				System.out.println("만화대여를 선택하셨습니다.");
				book.info();
				basket.add(book);
				System.out.println("x.되돌아가기");
				cmd = sc.next();
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