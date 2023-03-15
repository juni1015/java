package day4;

import java.util.Scanner;

public class G_Ex05_drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int balance = 10000;
		while(true) {
			System.out.printf("=====자판기===== 현재잔액 : %,d원\n",balance);
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 4.충전 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			int quantity = 0;
			if(menu == 1 || menu == 2 || menu == 3) {
				System.out.print("수량> ");
				quantity = sc.nextInt();
			}
			int total = 0;
			String pro = "";
			
			if(menu == 1) {
				total = 1000*quantity;
				pro = "콜라";
			}else if(menu == 2) {
				total = 1200*quantity;
				pro = "사이다";
			}else if(menu == 3) {
				total = 1500*quantity;
				pro = "우유";
			}else if(menu == 4) {
				System.out.print("충전금액입력> ");
				balance += sc.nextInt();
				System.out.println("충전완료!");
			}else if(menu == 0) {
				break;
			}
			
			if(menu == 1 || menu == 2 || menu == 3) {
				if(total > balance) {
					System.out.println("잔액부족");
				}else {
					balance -= total;
					System.out.printf("%s %d개 구매 완료\n",pro, quantity);
				}
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}

