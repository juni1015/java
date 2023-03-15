package day4;

import java.util.Scanner;

public class D_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 숫자를 입력받아 오름차순, 내림차순중 선택하여 정렬하는 코드를 작성하라

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("=====정렬=====");
			System.out.print("첫번째 숫자입력> ");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자입력> ");
			int num2 = sc.nextInt();

			int tmp1 = 0;
			int tmp2 = 0;

			if (num1 < num2) {
				tmp1 = num1;
				tmp2 = num2;
			} else if (num2 < num1) {
				tmp1 = num2;
				tmp2 = num1;
			}

			System.out.println();
			System.out.println("1.오름차순 2.내림차순");
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				for (int i = tmp1; i <= tmp2; i++) {
					System.out.println(i);
				}

			} else if (menu == 2) {
				for (int i = tmp2; i >= tmp1; i--) {
					System.out.println(i);

				}

			} else {
				System.out.println("다시입력하세요");
			}
		}

	}

}
