package day5;

public class H_배열예제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 )) 문자열 배열에 정수 10개 할당하고, 짝수의 합을더해서 출력해라 

		int[] num = { 1, 33, 22, 24, 21, 11, 23, 44, 56, 62 };
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				sum = sum + num[i];
			}

		}
		System.out.println(sum);

	}

}
