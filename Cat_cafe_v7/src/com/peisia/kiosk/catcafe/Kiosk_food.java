package com.peisia.kiosk.catcafe;

public class Kiosk_food {
	public static void food(){
		b: while (true) {
			System.out.println("식사 화면을 선택하셨습니다.");
			Kiosk.food1.info();
			Kiosk.food2.info();
			System.out.println("1.라면/2.김밥/x.되돌아가기");
			Kiosk.cmd = Kiosk.sc.next();
			switch (Kiosk.cmd) {
			case "1":
				System.out.println("라면을 선택하셨습니다");
				Kiosk.basket.add(Kiosk.food1);
				break;
			case "2":
				System.out.println("김밥을 선택하셨습니다");
				Kiosk.basket.add(Kiosk.food2);
				break;
			case "x":
				System.out.println("화면을 되돌아갑니다");
				break b;
			}
		}

	}
}
