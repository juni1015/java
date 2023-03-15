package day5;

import java.util.Scanner;

public class L_배열예제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 )) 정수형 배열에 정수의 공간 10개 할당하고,
		// 값이 3의 배수의 갯수, 5의배수의 갯수, 3과5의 배수의갯수를 출력하는 코드를 작성해라

		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int sum3 = 0;
		int sum5 = 0;
		int sum35 = 0;

		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자를 입력해주세요 >  ");
			num[i] = sc.nextInt();

			if (num[i] % 3 == 0 && num[i] % 5 == 0) {
				sum35++;

			}

			if (num[i] % 3 == 0) {
				sum3++;

			}

			if (num[i] % 5 == 0) {
				sum5++;

			}

		}
		System.out.println("3의 배수의 합을 출력합니다 " + sum3 + " 개 입니다");
		System.out.println("5의 배수의 합을 출력합니다 " + sum5 + " 개 입니다");
		System.out.println("3과5의 배수의 합을 출력합니다 " + sum35 + " 개 입니다");

		{
		}

	}

}
