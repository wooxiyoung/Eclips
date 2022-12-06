package com.peisia.kiosk.catcafe;

import com.peisia.util.Cw;

public class Kiosk_food {
	
	public static void food(){
		
		b: while (true) {
			System.out.println("식사 화면을 선택하셨습니다.");
			for(Product p : Kioskobj.products_food) {
				Cw.wn(p.name+""+p.price+"원");
			}
			System.out.println("1.라면/2.김밥/x.되돌아가기");
			Kioskobj.cmd = Kioskobj.sc.next();
			switch (Kioskobj.cmd) {
			case "1":
				System.out.println("라면을 선택하셨습니다");
				Kioskobj.basket.add(new Order(Kioskobj.products_food.get(0)));
				break;
			case "2":
				System.out.println("김밥을 선택하셨습니다");
				Kioskobj.basket.add(new Order(Kioskobj.products_food.get(1)));
				break;
			case "x":
				System.out.println("화면을 되돌아갑니다");
				break b;
			}
		}

	}
}
