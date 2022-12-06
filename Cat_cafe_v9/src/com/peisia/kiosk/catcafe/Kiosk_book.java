package com.peisia.kiosk.catcafe;

import com.peisia.util.Cw;

public class Kiosk_book {

	public void book() {
		Disp.Line();
		for (Product p : Kioskobj.products_book) {
			Cw.wn(p.name + "" + p.price + "원");
		}
		Disp.Line();
		System.out.println(Kioskobj.products_book.get(0).name + " 담겼습니다");
		Kioskobj.basket.add(new Order(Kioskobj.products_book.get(0)));
		System.out.println("x.되돌아가기");
		Kioskobj.cmd = Kioskobj.sc.next();

	}
}
