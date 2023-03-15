package day3;

public class a_복습_for문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 )) for 문으로 1~100까지 짝수의 합
		// for(int i=0; i<10; i++) 이용해서

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) { // 만약 i를 나누었을때 나머지가 0인 경우만!
				sum = sum + i; // sum+i 하여 sum 값으로 저장한다.
				// int test = 9;
			}

		}
		// System.out.println(test); test를 출력하고 싶다면 블록스코프 참조를 잘지켜야한다. for문안에서 선언된 test
		// 라서 출력이 불가능하다.
		System.out.println(" 1부터 100까지의 짝수의 합은 = " + sum);

	}

}



