package day5;

import java.util.Scanner;

public class N_배열예제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 )) (while사용) 정수형 배열에 정수의 공간 10개 할당하고,
		// 반복하면서 입력을 받는데 짝수만 배열에 10개 저장 후 값과 짝수의 갯수를 출력하는 코드를 작성하라

		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int i = 0;
		while (true) {
			System.out.print("숫자입력 > ");
			int number = sc.nextInt();

			if (number % 2 == 0) {
				num[i] = number;
				i++;
			}
			if (i == 10) {
				break;
			}
		}

		for (int j = 0; j < num.length; j++) {
			System.out.println(num[j]);
		}

	}
}
