package com.peisia.kiosk.catcafe;

import com.peisia.util.Cw;

public class Kiosk_option {

	public static void run() {
		Cw.wn("시럽을 선택해주세요");
		h: while (true) {

			Disp.Line();
			for (Product p : Kioskobj.products_syrup) {
				Cw.wn(p.name + "" + p.price + "원 추가");
			}
			Disp.Line();
			Cw.wn("1.옵션없음/2.헤이즐넛/3.바닐라/4.카라멜/x.되돌아가기");
			Kioskobj.cmd = Kioskobj.sc.next();

			switch (Kioskobj.cmd) {
			case "1":
				System.out.println(Kioskobj.products_syrup.get(0).name + " 선택되어 음료화면으로 나갑니다");
				Kioskobj.basket.add(new Order(Kioskobj.products_syrup.get(0)));
				break h;

			case "2":
				System.out.println(Kioskobj.products_syrup.get(1).name + " 선택되어 음료화면으로 나갑니다");
				Kioskobj.basket.add(new Order(Kioskobj.products_syrup.get(1)));
				break h;

			case "3":
				System.out.println(Kioskobj.products_syrup.get(2).name + " 선택되어 음료화면으로 나갑니다");
				Kioskobj.basket.add(new Order(Kioskobj.products_syrup.get(2)));
				break h;

			case "4":
				System.out.println(Kioskobj.products_syrup.get(3).name + " 선택되어 음료화면으로 나갑니다");
				Kioskobj.basket.add(new Order(Kioskobj.products_syrup.get(3)));
				break h;

			case "x":
				System.out.println("화면을 되돌아갑니다");
				break h;
			}

		}

	}
}
