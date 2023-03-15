package day5;

import java.util.Scanner;

public class K_배열예제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 )) 정수형 배열에 정수의 공간 10개 할당하고, 값이 3의 배수의 합 출력

		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력해주세요 >  ");
			num[i] = sc.nextInt();

			if (num[i] % 3 == 0) {
				sum = sum + num[i];

			}

		}
		System.out.println("3의 배수의 합을 출력합니다");
		System.out.println(sum);
	}

}
