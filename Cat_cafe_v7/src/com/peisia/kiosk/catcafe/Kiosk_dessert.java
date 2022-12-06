package com.peisia.kiosk.catcafe;

public class Kiosk_dessert {
	public void dessert() {

		d: while (true) {
			System.out.println("디저트 화면을 선택하셨습니다.");
			Kiosk.dessert1.info();
			Kiosk.dessert2.info();
			System.out.println("1.마카롱/2.샌드위치/x.되돌아가기");
			Kiosk.cmd = Kiosk.sc.next();
			switch (Kiosk.cmd) {
			case "1":
				System.out.println("마카롱을 선택하셨습니다");
				Kiosk.basket.add(Kiosk.dessert1);
				break;
			case "2":
				System.out.println("샌드위치을 선택하셨습니다");
				Kiosk.basket.add(Kiosk.dessert2);
				break;
			case "x":
				System.out.println("화면을 되돌아갑니다");
				break d;
			}
		}
	}
}