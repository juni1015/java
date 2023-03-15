package day2;

import java.util.Scanner;

public class 조건문_switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//스위치 케이스는 키와 같은 값을 인식, if문과 비슷하지만 연산조건을 넣을 수 없음 
		//int a = 5;
		//String aa = "1";	//문자열로 잡을 경우 case의 키도 ""를 사용하여 문자열로 지정해야함
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~3 중 숫자입력> ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
			default:
				System.out.println("1~3까지 입력해주세요.");
		}

	}

}
