package com.peisia.kiosk.catcafe;

public class Kiosk_cat {

	public void cat() {

		e: while (true) {
			System.out.println("고양이간식을 선택하셨습니다.");
			Kiosk.cat1.info();
			Kiosk.cat2.info();
			System.out.println("1.츄르/2.참치캔/x.되돌아가기");
			Kiosk.cmd = Kiosk.sc.next();
			switch (Kiosk.cmd) {
			case "1":
				System.out.println("츄르를 선택하셨습니다");
				Kiosk.basket.add(Kiosk.cat1);
				break;
			case "2":
				System.out.println("참치캔을 선택하셨습니다");
				Kiosk.basket.add(Kiosk.cat2);
				break;
			case "x":
				System.out.println("화면을 되돌아갑니다");
				break e;
			}
		}
	}

}