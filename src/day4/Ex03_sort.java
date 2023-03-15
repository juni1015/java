package day4;

import java.util.Scanner;

public class Ex03_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("=====정렬=====");
			System.out.print("첫번째 숫자 입력> ");
			int num1 = sc.nextInt();
			System.out.print("두번째 숫자 입력> ");
			int num2 = sc.nextInt();
			
			if(num1 > num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			
			System.out.println("1.오름차순 2.내림차순");
			System.out.print("메뉴 선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
//				for(int i = 1; i <= num; i++) {		//j
//					System.out.print(i + "\t");
//				}
				
//				if(num1 >= num2) {
//					for(int i = num2; i <= num1; i++) {
//						System.out.print(i + "\t");
//					}
//				} else if(num1 <= num2) {
//					for(int i = num1; i <= num2; i++) {
//						System.out.print(i + "\t");
//					}
//				}
				
				
				for(int i = num1; i <= num2; i++) {
					System.out.print(i + "\t");
				}
				
				
			} else if(menu == 2) {
//				for(int i = 1; num >= i; num--) {	//j
//					System.out.print(num + "\t");
//				}
				
//				for(int i = 0; num > i; num--) {
//					System.out.print(num + "\t");
//				}
				
//				for(int i = num; i > 0; i--) {
//					System.out.println(i);
//				}

//				for(int i = 0; i < num; i++) {
//					System.out.print((num - i) + "\t");
//				}

//				if(num1 >= num2) {		//num1 클 경우
//					for(int i = num1; i >= num2; i--) {
//						System.out.print(i + "\t");
//					}
//				} else if(num1 <= num2) {
//					for(int i = num2; i >= num1; i--) {
//						System.out.print(i + "\t");
//					}
//				}

				for(int i = num2; i >= num1; i--) {
					System.out.print(i + "\t");
				}
				
			} else {
				System.out.println("다시 입력");
			}
			System.out.println("\n");
		}

	}

}
