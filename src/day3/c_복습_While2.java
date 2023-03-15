package day3;

import java.util.Scanner;

public class c_복습_While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 )) 숫자를 계속 입력 받다가 0이 입력되면 '끝' 출력

		Scanner sc = new Scanner(System.in);
		int num = 1;

		while (num != 0) {
			System.out.print("숫자입력 > ");
			num = sc.nextInt();
			if (num == 0) {
				break;

			}
		}

		System.out.println(" 0이 출력되어 종료합니다 ");

	}

}
