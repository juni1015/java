package day3;

import java.util.Scanner;

public class d_복습_While_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner sc = new Scanner(System.in);
		long money = 10000;
		int num = 1;

		while (num != 0) {
			System.out.println("=====자판기===== \t현재잔액 : "+money+"원");
			System.out.println("1.콜라(1000) 2.사이다(1200) 3.우유(1500) 0.종료");
			System.out.print("메뉴선택 > ");
			num = sc.nextInt();
			
			if (num == 1) {
				money = money - 1000;
				System.out.print("콜라구입성공!\n\n");
			}else if(num == 2) {
				money = money - 1200;
				System.out.print("사이다구입성공!\n\n");
			}else if(num == 3) {
				money = money - 1500;
				System.out.print("우유구매성공!\n\n");
			}else if(num ==4) {
				System.out.print("우유선택\n\n");
			}
		}

		System.out.println("종료");

	}

}
