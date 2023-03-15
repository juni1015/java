package day3;

import java.util.Scanner;

public class g_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String id = "test";
		String pw = "1234";
		boolean run = true;
		while (run) {

			System.out.println("=====로그인====");
			System.out.print("아이디입력> ");
			String loginId = sc.next();
			System.out.print("비밀번호입력> ");
			String loginPw = sc.next();

			if (loginId.equals(id) && loginPw.equals(pw)) {

				System.out.println("로그인성공!");
				run = false; // 로그인이 성공하면 run을 false로 만들어서 반복문 while문을 빠져나간다.
			} else {
				System.out.println("로그인실패");
				System.out.println("다시시도(Y/N)");
				String restart = sc.next();
				if (restart.equals("Y")) {
					continue;

				} else if (restart.equals("N"))

					System.out.println("로그인 종료");
				break;

			}

		}

	}

}
