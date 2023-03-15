package day4;

import java.util.Scanner;

public class Ex05_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int balance = 10000;
		
		while(true) {
			System.out.printf("=====자판기===== 현재잔액 : %,d원\n", balance);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 4.충전 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 4) {
				System.out.print("충전할 금액> ");
				int input = sc.nextInt();
				
				while(true) {
					System.out.print("충전하시겠습니까?(Y/N) ");
					String ok = sc.next();

					if(ok.equals("Y")) {
						balance += input;
						System.out.printf("%,d원 충전 완료\n", input);
						break;
					} else if(ok.equals("N")) {
						System.out.println("충전하지 않음");
						break;
					} else {
						System.out.println("Y 또는 N을 제대로 입력");
					}					
				}
				continue;
//				balance += input;
//				System.out.printf("%,d원 충전 완료\n", input);
//				continue;
			} else if(menu == 0) {
				break;
			}
			
			System.out.print("수량> ");
			int quantity = sc.nextInt();
			
			if(menu == 1) {
				if(balance >= 1000 * quantity) {
					System.out.println("콜라" + quantity + "개 구매성공");
					balance -= 1000 * quantity;
				} else {
					System.out.println("잔액확인 필요");
				}
			} else if(menu == 2) {
				if(balance >= 1200 * quantity) {
					System.out.println("사이다" + quantity + "개 구매성공");
					balance -= 1200 * quantity;
				} else {
					System.out.println("잔액확인 필요");
				}
			} else if(menu == 3) {
				if(balance >= 1500 * quantity) {
					System.out.println("우유" + quantity + "개 구매성공");
					balance -= 1500 * quantity;
				} else {
					System.out.println("잔액확인 필요");
				}
			} else {
				System.out.println("메뉴 제대로 입력");
			}
		
			
		}
		System.out.println("종료");

	}

}
