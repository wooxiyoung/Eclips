package com.peisia.kiosk.catcafe;

import com.peisia.util.Cw;

public class Kiosk_drink {
	
	public void drink() {
		
	
	c: while (true) {
		System.out.println("음료 화면을 선택하셨습니다.");
		for(Product p:Kioskobj.products_drink) {
			Cw.wn(p.name+""+p.price+"원");
		}
		System.out.println("1.아이스 아메리카노/2.콜라/x.되돌아가기");
		Kioskobj.cmd = Kioskobj.sc.next();
		switch (Kioskobj.cmd) {
		case "1":
			Kioskobj.basket.add(new Order(Kioskobj.products_drink.get(0)));
			break;
		case "2":
			Kioskobj.basket.add(new Order(Kioskobj.products_drink.get(1)));
			break;
		case "x":
			System.out.println("화면을 되돌아갑니다");
			break c;
		}
		}
	}
}
