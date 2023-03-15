package day1;

import java.util.Scanner;

public class 조건문_if예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/////양수 음수 if문/////
		/*int a = 0;
		
		if(a < 0) {
			System.out.println("음수입니다.");
		} else if(a > 0) {
			System.out.println("양수입니다.");
		} else if(a == 0) {
			System.out.println("0입니다.");
		}*/
		
		
		/////점수 등급 if문/////
		/*int score = 59;
		
		if(score >= 90) {
			System.out.println("A");
		} else if(score >= 80) {
			System.out.println("B");
		} else if(score >= 70) {
			System.out.println("C");
		} else if(score >= 60) {
			System.out.println("D");
		} else if(score < 60) {
			System.out.println("F");
		}*/
		
		
		/////짝수 홀수 if문/////
		/*int num = 1;
		
		if(num == 0) {
			System.out.println("0");
		} else if(num % 2 == 0) {
			System.out.println("짝수");
		} else if(num % 2 != 0) {
			System.out.println("홀수");
		}*/
		
		
		/////계산기 값 입출력 if문/////
		/*Scanner sc  = new Scanner(System.in);	//sc변수 선언
		
		System.out.println("======계산기======");
		System.out.print("첫번째 숫자 입력> ");
		int num1 = sc.nextInt();	//nextInt 콘솔에서 입력받는 함수 / 콘솔에서 입력받은 값을 변수 num1에 넣음
		System.out.print("두번째 숫자 입력> ");
		int num2 = sc.nextInt();
		
		System.out.println("1.더하기 2.빼기 3.곱하기 4.나누기 5.나머지");
		System.out.print("메뉴선택> ");
		int menu = sc.nextInt();
		
		if(menu == 1) {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if(menu == 2) {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		} else if(menu == 3) {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		} else if(menu == 4) {
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		} else if(menu == 5) {
			System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		} else {
			System.out.println("메뉴 제대로 다시");
		}*/
		
		
		/////입력한 아이디와 패스워드 맞는지 확인하여 로그인 실패 성공 여부 확인 if문/////
		/*Scanner sc = new Scanner(System.in);
		
		String id = "test";
		String pw = "1234";	
		//string이 같은지 비교할 때는 == 이 아닌 변수.equals(변수) 로 string값 같은지 비교
		
		System.out.println("=====로그인=====");
		System.out.print("아이디 입력> ");
		String loginId = sc.next();	//변수명에 loginId와 같이 두 단어가 합친 변수명은 두번째 단어 앞이 대문자
		System.out.print("패스워드 입력> ");
		String loginPw = sc.next();	
		
		if(loginId.equals(id) && loginPw.equals(pw)) {
			System.out.println("로그인 성공");
		} else {
			//System.out.println("로그인 실패");
			if(loginId.equals(id)) {
				System.out.println("패스워드가 틀렸습니다.");
			} else if(loginPw.equals(pw)) {
				System.out.println("아이디가 틀렸습니다.");	
			} else {
				System.out.println("아이디와 패스워드가 모두 틀렸습니다.");	
			}
		}*/
		
		
		/////변수 a가 3의 배수면 3의 배수, 5의 배수이면 5의 배수, 3, 5 둘다면 둘다의 변수/////
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값 입력> ");
		int a = sc.nextInt();	//문자입력받을때 sc.next, sc.nextLine
		
		if(a != 0) {
			if(a % 3 == 0 && a % 5 == 0) {
				System.out.println("3과 5의 배수");
			} else if(a % 3 == 0) {
				System.out.println("3의 배수");
			} else if(a % 5 == 0) {
				System.out.println("5의 배수");
			} else {
				System.out.println("3과 5의 배수가 아님");
			}
		} else {
			System.out.println("0");
		}
		
	}

}
