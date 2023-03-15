package day5;

import java.util.Scanner;

public class Q_배열예제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 )) 배열 num의 값을 앞으로 한칸씩 뒤로 밀어내는 코드를 작성해라
		// 출력예시 {10,1,2,3,4,5,6,7,8,9,10}
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int lastNum = num[num.length - 1];
		for (int i = num.length - 1; i >= 0; i--) {
			if (i == 0) {
				num[i] = lastNum;

			} else
				num[i] = num[i - 1];
		}

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);
		}

	}

}
