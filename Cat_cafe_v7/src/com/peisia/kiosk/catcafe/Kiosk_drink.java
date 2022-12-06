package com.peisia.kiosk.catcafe;

public class Kiosk_drink {
	
	public void drink() {
		
	
	c: while (true) {
		System.out.println("음료 화면을 선택하셨습니다.");
		Kiosk.drink1.info();
		Kiosk.drink2.info();
		System.out.println("1.아이스 아메리카노/2.콜라/x.되돌아가기");
		Kiosk.cmd = Kiosk.sc.next();
		switch (Kiosk.cmd) {
		case "1":
			System.out.println("아이스 아메리카노를 선택하셨습니다");
			Kiosk.basket.add(Kiosk.drink1);
			break;
		case "2":
			System.out.println("콜라를 선택하셨습니다");
			Kiosk.basket.add(Kiosk.drink2);
			break;
		case "x":
			System.out.println("화면을 되돌아갑니다");
			break c;
		}
		}
	}
}
