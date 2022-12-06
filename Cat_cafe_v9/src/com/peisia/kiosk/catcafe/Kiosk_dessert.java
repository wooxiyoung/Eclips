package com.peisia.kiosk.catcafe;

import com.peisia.util.Cw;

public class Kiosk_dessert {
	public void dessert() {

		d: while (true) {
			System.out.println("디저트 화면을 선택하셨습니다.");
			for(Product p:Kioskobj.products_dessert) {
				Cw.wn(p.name+""+p.price+"원");
			}
			System.out.println("1.마카롱/2.샌드위치/x.되돌아가기");
			Kioskobj.cmd = Kioskobj.sc.next();
			switch (Kioskobj.cmd) {
			case "1":
				Kioskobj.basket.add(new Order(Kioskobj.products_dessert.get(0)));
				break;
			case "2":
				Kioskobj.basket.add(new Order(Kioskobj.products_dessert.get(1)));
				break;
			case "x":
				System.out.println("화면을 되돌아갑니다");
				break d;
			}
		}
	}
}
