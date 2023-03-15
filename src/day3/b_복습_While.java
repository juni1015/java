package day3;

public class b_복습_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 )) for 문으로 1~100까지 홀수의 합
		// while문을 이용해서

		int sum = 0;
		int i = 1;
		while (i <= 100) {
			if (i % 2 != 0) {
				sum += i; /// sum = sum + i

			}
			i++;
		}

		System.out.println(" 1부터 100까지의 홀수의 합은 = " + sum);

	}

}
