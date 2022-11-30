package com.peisia;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {

		

//int r = (int)(Math.random()*6+1);
//System.out.println("오늘의 숫자는 "+r);
//
		int v;

		
		while (true) {
			Scanner sc = new Scanner(System.in);
			String cmd = sc.next();
			System.out.println("사용자 : " + cmd);
			int r = (int) (Math.random() * 3 + 1);
			if (cmd.equals("가위") || cmd.equals("바위") || cmd.equals("보")) {
				
			} else {
				System.out.println("다시 입력하세요");
				
			}

			switch (cmd) {
			case "가위":
				switch (r) {
				case 1:
					System.out.println("시스템 : 가위");
					System.out.println("비겼습니다");
					break;
				case 2:
					System.out.println("시스템 : 바위");
					System.out.println("졌습니다");
					break;
				case 3:
					System.out.println("시스템 : 보");
					System.out.println("이겼습니다");
					break;
				}
				break;
			case "바위":
				switch (r) {
				case 1:
					System.out.println("시스템 : 가위");
					System.out.println("이겼습니다");
					break;
				case 2:
					System.out.println("시스템 : 바위");
					System.out.println("비겼습니다");
					break;
				case 3:
					System.out.println("시스템 : 보");
					System.out.println("졌습니다");
					break;
				}
				break;
			case "보":
				switch (r) {
				case 1:
					System.out.println("시스템 : 가위");
					System.out.println("졌습니다");
					break;
				case 2:
					System.out.println("시스템 : 바위");
					System.out.println("이겼습니다");
					break;
				case 3:
					System.out.println("시스템 : 보");
					System.out.println("비겼습니다");
					break;
				}
				break;
			}
		}
	}
}
