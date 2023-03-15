package day5;

import java.util.Scanner;

public class 배열예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/////문자열 배열에 문자열 5개를 할당하고 전체 출력/////
//		String [] a = new String[5];
//		
//		a[0] = "영";
//		a[1] = "일";
//		a[2] = "이";
//		a[3] = "삼";
//		a[4] = "사";
		
//		String [] a = {"영", "일", "이", "삼", "사"};
//		
//		for(int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		
		
		/////정수 배열 10칸에 값을 할당하고 짝수 인덱스에 맞는 값의 총합 출력/////
//		int [] num = {5, 2, 45, 8, 6, 1, 5, 45, 84, 15};
//		int total  = 0;
//		
//		for(int i = 0; i < num.length; i = i + 2) {
//				total += num[i];
//		}
//		System.out.println(total);
		
		//위의 문제 ver.2
//		for(int i = 0; i < num.length; i++) {
//			if(i % 2 == 0) {
//				total += num[i];
//			}
//		}
//		System.out.println(total);
		
		
		
		/////정수 배열 10칸에 값을 할당하고 짝수의 값을 가지고 있는 인덱스의 총합 출력/////
//		int [] num = {5, 2, 45, 8, 6, 1, 5, 45, 84, 15};
//		int total  = 0;
//		
//		for(int i = 0; i < num.length; i++) {
//			if(num[i] % 2 == 0) {
//				total += num[i];
//			}
//		}
//		System.out.println(total);

		
		
		/////정수 100칸의 배열을 만들고 1~100의 숫자를 넣음
//		int [] num = new int[100];
//		
//		for(int i = 0; i < 100; i++) {
//			num[i] = i + 1;
//			System.out.println(num[i]);
//		}
		
		
		
		/////스캐너로 숫자 배열 10칸을 입력받고 입력받은 숫자 10개를 모두 출력
//		Scanner sc = new Scanner(System.in);
//		
//		int [] num = new int[10];
//		
//		for(int i = 0; i < num.length; i++) {
//			System.out.print("숫자 입력> ");
//			num[i] = sc.nextInt();
//		}
//		
//		for(int i = 0; i < num.length; i++) {	//위의 for문에 변수 i 가 있는 것으로 블록 스코프에 의해 해당 for문에서도 변수 i 사용가능
//			System.out.println(num[i]);
//		}
		
		
		
		/////10칸짜리 정수 배열 선언 후 값을 입력받고 값이 3의 배수의 합 출력
//		Scanner sc = new Scanner(System.in);
//		
//		int [] num = new int[10];
//		int total = 0;
//		
//		for(int i = 0; i < num.length; i++) {
//			System.out.print("숫자 입력> ");
//			num[i] = sc.nextInt();
//
				//ver.2
////			if(num[i] != 0 && num[i] % 3 == 0) {
////				total += num[i];
////			}
//		}
//		
//		for(int i = 0; i < num.length; i++) {
//			if(num[i] != 0 && num[i] % 3 == 0) {
//				total += num[i];
//			}	
//		}
//		System.out.println(total);
		
		
		
		/////10칸짜리 정수 배열 선언 후 값을 입력받고 값이 3의 배수의 개수와 5의 배수의 개수, 3과 5의 배수의 개수 출력
//		Scanner sc = new Scanner(System.in);
//		
//		int [] num = new int[10];
//		int num3 = 0, num5 = 0, numTotal = 0;
//		
//		for(int i = 0; i < num.length; i++) {
//			System.out.print("숫자 입력> ");
//			num[i] = sc.nextInt();
//			
//			if(num[i] != 0) {		//j (더 깔끔)
//				if(num[i] % 3 == 0 && num[i] % 5 == 0) {
//					numTotal += 1;
//				}
//				if(num[i] % 3 == 0) {
//					num3 += 1;
//				}
//				if(num[i] % 5 == 0) {
//					num5 += 1;
//				}
//			} 
//			
//			//위의 문제 ver.2
////			if(num[i] != 0) {
////				if(num[i] % 3 == 0 && num[i] % 5 == 0) {
////					numTotal += 1;
////					num3 += 1;
////					num5 += 1;
////				} else if(num[i] % 3 == 0) {
////					num3 += 1;
////				} else if(num[i] % 5 == 0) {
////					num5 += 1;
////				}
////			}
//		}
//		System.out.println("3의 배수는 " + num3 + "개 입니다.");
//		System.out.println("5의 배수는 " + num5 + "개 입니다.");
//		System.out.println("3과 5의 배수는 " + numTotal + "개 입니다.");
		
		
		
		/////10칸의 정수 배열을 만들고 반복하면서 입력을 받는데 짝수만 배열에 저장 후 출력/////
//		Scanner sc = new Scanner(System.in);
//		
//		int [] num = new int[10];
//		int i = 0, input = 0, cnt = 10;
//		boolean run = true;
		
		//입력 및 저장 while문
//		while(run) {
//			System.out.print("숫자 입력> ");
//			input = sc.nextInt();
//	
//			if(input != 0) {
//				if(input % 2 == 0) {
//					num[i] = input;
//					i += 1;
//					cnt -= 1;
//				}
//				if(cnt == 0) {
//					run = false;
//				}
//			}
//		}
		
		//입력 및 저장 for문
//		for(i = 0; i < num.length; i++) {
//			System.out.print("숫자 입력> ");
//			input = sc.nextInt();
			
			//잘못된 예
//			if(input != 0) {		//i--를 해주는 값이 없기 때문에 인덱스 0에 내가 입력한 0이 아닌 초기값인 0이 들어감	
//				if(input % 2 != 0) {
//					i--;
//				} else {
//					num[i] = input;	
//				}
//			}
			//잘못된 예 ver.2
//			if(input != 0) {
//				i--;
//				if(input % 2 != 0) {
//					i--;		
//					//앞에서 0이 아닐 때 i-- 후 홀수 입력 시 다시 i--되어 i가 -가 되는 경우가 생기기 때문에 오류 발생함
//				} else {
//					num[i] = input;	
//				}
//			}
			//위의 잘못된 예의 제대로 된 버전
//			if(input == 0 || input % 2 != 0) {
//				i--;
//			} else {
//				num[i] = input;	
//			}
//		}
		
//		System.out.println("----------입력하신 짝수----------");
//		//출력 for문
//		for(int j = 0; j < num.length; j++) {
//			System.out.println((j+1) + "번 숫자 : "+ num[j]);
//		}
		
		//출력 while문
//		int j = 0;
//		while(true) {
//			if(j < num.length) {
//				System.out.println((j+1) + "번 숫자 : "+ num[j]);
//				j += 1;
//			} else {
//				break;
//			}
//		}
		
		
		/////값을 입력받고 배열 num의 값을 앞으로 한칸씩 당기시오///// J
		//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}의 경우 {2, 3, 4, 5, 6, 7, 8, 9, 10, 1}로 출력
//		Scanner sc = new Scanner(System.in);
//		int [] num = new int[5];
//		int save = 0;
//		
//		for(int i =  0; i < num.length; i++) {
//			System.out.print("숫자 입력> ");
//			num[i] = sc.nextInt();
//			
//			if(i == 0) {
//				save = num[i];
//			} 
//		}
//		
//		System.out.println("-----입력한 값 한칸씩 당기기-----");
//		for(int i = 0; i < num.length; i++) {		
//			
//			if(i == num.length-1) {
//				num[i] = save;
//			} else {
//				num[i] = num[i + 1];
//			}
//			System.out.println(num[i]);
//		}
		

		/////배열 num의 값을 앞으로 한칸씩 당기시오/////
		//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}의 경우 {2, 3, 4, 5, 6, 7, 8, 9, 10, 1}로 출력
//		int [] num  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int num0 = num[0];
//		
//		for(int i = 0; i < num.length; i++) {
//			if(i == num.length-1) {
//				num[i] = num0;
//				break;
//			}
//			num[i] = num[i+1];
//		}
//		for(int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
		
		
		/////배열 num의 값을 앞으로 한칸씩 미시오/////
		//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}의 경우 {10, 1, 2, 3, 4, 5, 6, 7, 8, 9}로 출력
//		int [] num  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int num0 = num[num.length-1];
//		
//		for(int i = num.length-1; i <= num.length-1; i--) {
//			if(i == 0) {
//				num[i] = num0;
//				break;
//			}
//			num[i] = num[i-1];
//		}
//		for(int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
		

//		int [] num  = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
////		int [] num  = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
//		int save = 0, save2 = 0;
//		
//		for(int i = 0; i < num.length; i++) {
//			if(i == 0) {
//				save = num[i];
//				num[i] = num[num.length-1];
//			} else {
//				if(i == 1) {
//					save2 = num[i];
//					num[i] = save;
//				} else if(i % 2 == 0){
//					save = num[i];
//					num[i] = save2;
//				} else {
//					save2 = num[i];
//					num[i] = save;
//				}
//			}
//		}
//		for(int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
		
		
	
	
	}

}
