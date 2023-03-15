package day8;

import java.util.Scanner;

public class Util {
	//숫자 체크 메소드 ver.1
	public int numberCheck() {
		int result;
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(sc.hasNextInt()) {
				result = sc.nextInt();
				break;
			} else {
				System.out.println("숫자만 입력> ");
				sc.nextLine();
			}
		}
		return result;
	}
	
	//숫자 체크 메소드 ver.2
	public int numberCheck1(String str) {
		int result;
		Scanner sc = new Scanner(System.in);
		while(true) {
			if(sc.hasNextInt()) {
				result = sc.nextInt();
				break;
			} else {
				System.out.println(str + "는 숫자만 입력> ");
				sc.nextLine();
			}
		}
		return result;
	}
	
	//아이디는 6자 이내 체크 함수
	public String lengthCheck(String str, int maxLength) {
		Scanner sc = new Scanner(System.in);
		String result;
		
		while(true) {
			result = sc.next();
			System.out.print(str + " 입력> ");
			if(result.length() <= maxLength) {
				break;
			}
			System.out.printf("%s의 최대 글자수는 %d입니다> ", str, maxLength);
		}
		return result;
	}

}
