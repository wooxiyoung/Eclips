package com.peisia.kiosk.catcafe;

public class Kiosk_book {

	public void book() {

		System.out.println("만화대여를 선택하셨습니다.");
		Kiosk.book.info();
		Kiosk.basket.add(Kiosk.book);
		System.out.println("x.되돌아가기");
		Kiosk.cmd = Kiosk.sc.next();
		
	}
}
