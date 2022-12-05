package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Product> basket = new ArrayList<Product>();
		Product dr1 = new Product("아이스 아메리카노", 3500);
		Product dr2 = new Product("아이스 카페라떼", 4000);
		Product dr3 = new Product("아이스 바닐라라떼", 4500);
		Product de1 = new Product("마카롱", 3200);
		Product de2 = new Product("케이크", 4700);
		Product de3 = new Product("르뱅 쿠키", 3500);
		basket.add(dr1);

		
		
		System.out.println("환영합니다");
		
		Scanner sc = new Scanner(System.in);
		String cmd;
		
		loop_a: while (true) {
			
			System.out.println("주문화면 1.음료/2.디저트/주문하기:y");
			cmd = sc.next();
			
			switch (cmd) {
			
			case "1":
				System.out.println("1번 음료");
				dr1.info();
				dr2.info();
				dr3.info();
				
				loop_b: while (true) {
					System.out.println("");
					System.out.println("1.아이스 아메리카노/2.아이스 카페라떼/3.아이스 바닐라라떼/x:이전 메뉴");
					System.out.println("");
					cmd = sc.next();
					
					switch (cmd) {
					
					case "1":
						System.out.println("아이스 아메리카노가 선택되었습니다");
						dr1.info();
						
						basket.add(dr1);
						break;

					case "2":
						System.out.println("아이스 카페라떼가 선택되었습니다");
						dr2.info();
						basket.add(dr2);
						break;

					case "3":
						System.out.println("아이스 바닐라라떼가 선택되었습니다");
						dr3.info();
						basket.add(dr3);
						break;

					case "x":
						System.out.println("이전 메뉴");
						break loop_b;
					}
				}
				break;
				
			case "2":
				
				System.out.println("2번 디저트");
				de1.info();
				de2.info();
				de3.info();
				
				loop_c: while (true) {
					
					System.out.println("1.마카롱/2.케이크/3.르뱅 쿠키/x:이전 메뉴");
					cmd = sc.next();
					
					switch (cmd) {
					
					case "1":
						System.out.println("마카롱이 선택되었습니다");
						de1.info();
						basket.add(de1);
						System.out.println();
						break;

					case "2":
						System.out.println("케이크가 선택되었습니다");
						de2.info();
						basket.add(de2);
						break;

					case "3":
						System.out.println("르뱅 쿠키가 선택되었습니다");
						de3.info();
						basket.add(de3);
						break;

					case "x":
						System.out.println("이전 메뉴");
						break loop_c;
					}
				}
				break;
				
			case "y":
				
				System.out.println("장바구니에 담긴 상품 갯수 : "+basket.size()+"개");
				System.out.println("장바구니에 담긴 물품 : ");
				
				int sum = 0;
				for(int i=0;i<basket.size();i=i+1) {
					sum = sum + basket.get(i).price;
					System.out.println(basket.get(i).name); 
				}
				System.out.println("계산하실 금액은 :"+sum+"원 입니다.");
				break loop_a;
			}
		}
		System.out.println("프로그램 종료");
	}
}