package day2;

import java.util.Scanner;

public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for문의 while의 증감값이 추가된 함수
		//while은 조건만 맞으면 계속 반복됨(무한 루프)
		
		/////1~10000까지 합산
		/*int i = 1;
		int sum = 0;
		
		while(i <= 10000) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);*/
		
		
		/////숫자를 계속 입력받다가 0이 입력되면 반복문 종료/////
		/*Scanner sc = new Scanner(System.in);
		
		int i = 1;
		
		while(i != 0) {			
			System.out.print("숫자 입력> ");
			i = sc.nextInt();
		}
		System.out.println("0이 입력되어 끝");*/
		
		//@@위의 문제 선생님 풀이@@//
		/*Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		
		while(check) {			
			System.out.print("숫자 입력> ");
			int num = sc.nextInt();
			if(num == 0) {
				check = false;
			}
		}
		System.out.println("0이 입력되어 끝");*/
		
		
		/////숫자를 계속 입력받으면서 3의 배수, 5의 배수, 3과 5의 배수 출력하는데 0이 입력되면 반복문 끝
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력> ");
		int num = sc.nextInt();

		while(num != 0) {
			if(num % 3 == 0 && num % 5 == 0) {
				System.out.println("3과 5의 배수");
			} else if(num % 3 == 0) {
				System.out.println("3의 배수");
			} else if(num % 5 == 0) {
				System.out.println("5의 배수");
			} else {
				System.out.println("3과 5의 배수 아님");
			}
			System.out.print("숫자 입력> ");
			num = sc.nextInt();
		}
		System.out.println("0");*/
		
		//@@위의 문제 선생님 풀이@@//
		/*Scanner sc = new Scanner(System.in);
		
		boolean check = true;

		while(check) {
			System.out.print("숫자 입력> ");
			int num = sc.nextInt();
			
			if(num == 0) {
				check = false;
			} else if(num % 3 == 0 && num % 5 == 0) {
				System.out.println("3과 5의 배수");
			} else if(num % 3 == 0) {
				System.out.println("3의 배수");
			} else if(num % 5 == 0) {
				System.out.println("5의 배수");
			} else {
				System.out.println("3과 5의 배수 아님");
			}
		}
		System.out.println("끝");*/
		
		//@@위의 문제 선생님 풀이@@//
		Scanner sc = new Scanner(System.in);
		
		int num = -1;

		while(num != 0) {
			System.out.print("숫자 입력> ");
			num = sc.nextInt();
			
			if(num != 0) {
				if(num % 3 == 0 && num % 5 == 0) {
					System.out.println("3과 5의 배수");
				} else if(num % 3 == 0) {
					System.out.println("3의 배수");
				} else if(num % 5 == 0) {
					System.out.println("5의 배수");
				} else {
					System.out.println("3과 5의 배수 아님");
				}
			}
		}
		System.out.println("끝");


	}

}
