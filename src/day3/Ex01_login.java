package day3;

import java.util.Scanner;

public class Ex01_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String id = "test";
		String pw = "1234";
		boolean run = true;
		
		while(run) {
			System.out.println("=====로그인=====");
			System.out.print("아이디 입력> ");
			String loginId = sc.next();
			System.out.print("패스워드 입력> ");
			String loginPw = sc.next();
			
			if(loginId.equals(id) && loginPw.equals(pw)) {
				System.out.println("로그인 성공!");
				run = false;
			} else {
				System.out.println("로그인 실패ㅠ");
				System.out.print("다시시도(Y/y) ");
				String restart = sc.next();
				
				if(!(restart.equals("Y") || restart.equals("y"))) {
					System.out.println("종료");
					run = false;
				}
			}
		}

	}

}
