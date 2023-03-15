package day3;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자바 변수의 사용 범위를 스코프라고 함
		//블록 스코프는 {} 등 해당 안에서만 변수를 사용할 수 있음
		
		/////for문으로 1~100까지 짝수의 합을 for문으로/////
		/*int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0 ) {
				sum = sum + i;
			}
		}
		System.out.println(sum);*/
		
		/////변수 스코프에 대한 문제/////
		/*int sum;	//무조건 초기화되어 값이 있어야 변수 사용 가능함
		
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0 ) {
				sum = 0;	//sum을 반복적으로 0으로 초기화하기 때문에 제대로 된 1~100까지 짝수의 합이 계산되지 않음
				sum = sum + i;
			}
		}
		System.out.println(sum);
		//for문에서 초기화해도 for문 밖에서 초기화되지 않았기 때문에 변수가 위에서 선언되었어도 값이 없어 에러 발생함*/
		
		/////변수 스코프에 대한 문제 ver.2/////
		/*int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			sum = sum + i;
			int test = 9;
			if(true) {
				int test = 7;	//for문 안에 test 변수가 있기 때문에 같은 변수명을 사용할 경우 에러 발생함
			}
		}
		int test = 8;				//for문에만 test 변수가 있기 때문에 사용 가능
		System.out.println(test);	//출력값이 8 이 출력됨
		System.out.println(sum);	//for문에서 저장된 1~10까지의 합인 55가 출력됨*/
		
		
		/////1~100까지 홀수의 합을 while문으로/////
		/*int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			if(i % 2 != 0) {
				sum += i;	//sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);*/
		
		
		/////숫자를 계속 입력받다가 0이 입력되면 '끝' 출력을 while문으로/////
		/*Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("숫자입력> ");
			int num = sc.nextInt();
			
			if(num == 0) {
				break;
			}
		}
		System.out.println("끝");*/
	}

}
