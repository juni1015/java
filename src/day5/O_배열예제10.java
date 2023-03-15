package day5;

import java.util.Scanner;

public class O_배열예제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 )) 정수형 배열에 정수의 공간 10개 할당하고,
		// 반복하면서 입력을 받는데 짝수만 배열에 10개 저장 후 값과 짝수의 갯수를 출력하는 코드를 작성하라

		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];
		int Even[] = new int[10];
		num = Even;
		int EvenSum = 0;

		for (int i = 0; i < num.length; i++) {
			System.out.print("숫자를 입력해주세요 >  ");
			num[i] = sc.nextInt();
			if (num[i] % 2 != 0) {
				i--;
			} 

		}
		for (int i = 0; i < Even.length; i++) {
			System.out.print(Even[i] + "\t");

			EvenSum++;

		}
		System.out.println();
		System.out.print("출력된 짝수의 갯수는" + EvenSum + "개 입니다");
	}

}
