package day5;

import java.util.Scanner;

public class p_배열예제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 )) 배열 num의 값을 앞으로 한칸씩 당기시오
		// 출력예시 {2,3,4,5,6,7,8,9,10,1}
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int num0 = num[0];

		for (int i = 0; i < num.length; i++) {
			if (i == num.length - 1) {
				num[i] = num0;

			} else
				num[i] = num[i + 1];
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}

	}

}
