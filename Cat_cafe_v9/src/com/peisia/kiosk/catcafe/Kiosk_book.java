package com.peisia.kiosk.catcafe;

import com.peisia.util.Cw;

public class Kiosk_book {

	public void book() {
		for(Product p:Kioskobj.products_book) {
			Cw.wn(p.name+""+p.price+"원");
		}
		Kioskobj.basket.add(new Order(Kioskobj.products_book.get(0)));
		System.out.println("x.되돌아가기");
		Kioskobj.cmd = Kioskobj.sc.next();
		
	}
}
