package day4;

import java.util.Scanner;

public class Ex02_calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		double result = 0;
		
		while(run) {
			System.out.println("=====계산기=====");
			System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
			System.out.print("메뉴 입력> ");
			int menu = sc.nextInt();
			
			if(menu < 0 || menu > 5  ) {
				System.out.println("0~5까지 입력 가능");
				continue;
			}
			
			System.out.print("첫번째 숫자 입력> ");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자 입력> ");
			int num2 = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
				result = num1 + num2;
				break;
			case 2:
				System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
				result = num1 - num2;
				break;
			case 3:
				System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
				result = num1 * num2;
				break;
			case 4:
				System.out.printf("%d / %d = %.2f\n", num1, num2, num1 / (double)num2);
				result = num1 / num2;
				break;
			case 5:
				System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);
				result = num1 % num2;
				break;
			}
			System.out.println("1.이어하기 2.새로하기 0.종료");
			System.out.print("메뉴선택> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				while(true) {
					System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
					System.out.print("메뉴선택> ");
					menu = sc.nextInt();
					System.out.print("숫자입력> ");
					int num = sc.nextInt();
					
					if(menu == 1) {
						System.out.printf("%.2f + %d = %.2f\n", result, num, result + num);
					} else if(menu == 2) {
						System.out.printf("%.2f - %d = %.2f\n", result, num, result - num);
					} else if(menu == 3) {
						System.out.printf("%.2f * %d = %.2f\n", result, num, result * num);
					} else if(menu == 4) {
						System.out.printf("%.2f / %d = %.2f\n", result, num, result / (double)num);
					} else if(menu == 5) {
						System.out.printf("%.2f %% %d = %.2f\n", result, num, result % num);
					}
					System.out.println("1.이어하기 2.새로하기 0.종료");
					System.out.println("메뉴선택> ");
					menu = sc.nextInt();
					if(menu == 1) {
						
					} else if(menu == 2) {
						break;
					} else if(menu == 3) {
						run = false;
						break;
						
					}
				}
//				break;
			case 2:
				break;
			case 0:
				run = false;
				break;
				default:
					System.out.println("0~2까지 입력가능");
			}
		}
		System.out.println("종료");

	}

}
