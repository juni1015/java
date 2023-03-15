package day5;

import java.util.Scanner;

public class J_배열예제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 )) 정수형 배열에 정수의 공간 10개 할당하고, 10가지의 입력을받고 출력하는 코드를 작성해라

		Scanner sc = new Scanner(System.in);
		int num[] = new int[10];

		for (int i = 0; i < num.length; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력해주세요 >  ");
			num[i] = sc.nextInt();

		}
		System.out.println("입력받은 숫자를 출력합니다.");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}

	}

}
