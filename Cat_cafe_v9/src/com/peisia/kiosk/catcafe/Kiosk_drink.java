package com.peisia.kiosk.catcafe;

import com.peisia.util.Cw;

public class Kiosk_drink {

	public void drink() {

		c: while (true) {
			Disp.Line();
			for (Product p : Kioskobj.products_drink) {
				Cw.wn(p.name + "" + p.price + "원");
			}
			Disp.Line();
			System.out.println("1.아이스 아메리카노/2.콜라/x.되돌아가기");
			Kioskobj.cmd = Kioskobj.sc.next();
			switch (Kioskobj.cmd) {
			case "1":
				System.out.println(Kioskobj.products_drink.get(0).name + " 담겼습니다");
				Kioskobj.basket.add(new Order(Kioskobj.products_drink.get(0)));
				Kiosk_option.run();
				break;
			case "2":
				System.out.println(Kioskobj.products_drink.get(1).name + " 담겼습니다");
				Kioskobj.basket.add(new Order(Kioskobj.products_drink.get(1)));
				break;
			case "x":
				System.out.println("화면을 되돌아갑니다");
				break c;
			}
		}
	}
}
