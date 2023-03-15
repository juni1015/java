package day3;

import java.util.Scanner;

public class 실습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		///// 자판기 while문
		Scanner sc = new Scanner(System.in);

		// long money = 10000;

		System.out.print("사용하실 금액을 입력> ");
		long money = sc.nextLong();

		System.out.println("-------------------------------------");

		String listcoke = "", listsoda = "", listmilk = "";
		int sumcoke = 0, sumsoda = 0, summilk = 0;

		while (true) {
			System.out.println("=====자판기=====\t현재잔액 : " + money + "원");
			System.out.println("1.콜라(1,000) 2.사이다(1,200) 3.우유(1,500) 0.종료");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();

			int ea = 0;

			if (menu == 0) { // 종료
				System.out.println("종료\n");
				System.out.println("//////////영수증//////////\n" + listcoke + listsoda + listmilk
						+ "-------------------------\n" + "반환되는 금액 \t" + money + "원");
				// System.out.print("-------------------------\n" + "반환되는 금액 \t" + money + "원");
				break;
			} else if (menu == 1) { // 콜라
				System.out.print("개수 입력> ");
				ea = sc.nextInt();

				if (ea > 0) {
					if (money >= (1000 * ea)) {
						money -= (1000 * ea);
						System.out.println("콜라 " + ea + "개 구입성공\t" + (1000 * ea) + "원");
						
						sumcoke += ea;
						listcoke = ("콜라 " + sumcoke + "개 구입 \t" + (1000 * sumcoke) + "원\n");
					} else {
						System.out.println("잔액 확인필요");
					}
				} else {
					System.out.println("개수는 1 이상 입력필요");
				}
			} else if (menu == 2) { // 사이다
				System.out.print("개수 입력> ");
				ea = sc.nextInt();

				if (ea > 0) {
					if (money >= (1200 * ea)) {
						money -= (1200 * ea);
						System.out.println("사이다 " + ea + "개 구입성공\t" + (1200 * ea) + "원");
						
						sumsoda += ea;
						listsoda = ("사이다 " + sumsoda + "개 구입\t" + (1200 * sumsoda) + "원\n");
					} else {
						System.out.println("잔액 확인필요");
					}
				} else {
					System.out.println("개수는 1 이상 입력필요");
				}
			} else if (menu == 3) { // 우유
				System.out.print("개수 입력> ");
				ea = sc.nextInt();

				if (ea > 0) {
					if (money >= (1500 * ea)) {
						money -= (1500 * ea);
						System.out.println("우유 " + ea + "개 구입성공\t" + (1500 * ea) + "원");
						
						summilk += ea;
						listmilk = ("우유 " + summilk + "개 구입 \t" + (1500 * summilk) + "원\n");
					} else {
						System.out.println("잔액 확인필요");
					}
				} else {
					System.out.println("개수는 1 이상 입력필요");
				}
			} else {
				System.out.println("메뉴 제대로 다시 선택");
			}
			System.out.print("\n");
		}

	}

}
