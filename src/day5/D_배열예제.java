package day5;

public class D_배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 )) int배열 10칸에 값을 할당하고, 총 합 출력

		int[] num = { 1, 33, 22, 24, 21, 11, 23, 44, 56, 62 };
	    int sum = 0;

		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];

		}
		System.out.println(sum);

	}

}
