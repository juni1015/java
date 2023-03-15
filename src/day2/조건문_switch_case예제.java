package day2;

import java.util.Scanner;

public class 조건문_switch_case예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/////변수 a에 숫자를 입력받고, 1~12까지 각각 매달을 영어로 표기되는 switch문/////
		/*Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력> ");
		int a = sc.nextInt();
		
		switch(a) {
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("February");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("Jun");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("September");
				break;
			case 10:
				System.out.println("October");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				default:
					System.out.println("1~12 중 입력 필요");
		}*/
		
		
		/////계산기 값 입출력 switch문/////
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번재 숫자 입력> ");
		int num1 = sc.nextInt();
		System.out.print("두번재 숫자 입력> ");
		int num2 = sc.nextInt();
		
		System.out.println("메뉴 입력 1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
		int menu = sc.nextInt();
		
		switch(menu) {
			case 1: 
				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
				System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));	//%뒤의 d는 숫자를 뜻함
				break;
			case 2:
				System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
				break;
			case 3:
				System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
				break;
			case 4:
				System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
				break;
			case 5:
				System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
				break;
				default:
					System.out.println("메뉴 제대로 다시 선택");
		}

	}

}
