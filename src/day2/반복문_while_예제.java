package day2;

import java.util.Scanner;

public class 반복문_while_예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 ) 숫자를 계속 입력 받으면서 3의배수, 5의배수, 3과5의 배수를 출력
		// 0이 입력되면 반복분을 끝내시오 ( while문 사용 )

		Scanner sc = new Scanner(System.in);

		int a = 1;
		while (a != 0) {
			System.out.print("숫자를 입력해주세요 : ");
			a = sc.nextInt();

			if (a == 0) {
			} else if (a % 3 == 0 && a % 5 == 0) {
				System.out.println("3,5 배수 입니다");
			} else if (a % 3 == 0) {
				System.out.println("3의 배수 입니다");

			} else if (a % 5 == 0) {
				System.out.println("5의 배수 입니다");
			}

		}
		System.out.println("종료되었습니다");

	}

}
