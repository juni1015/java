package day5;

import java.util.Scanner;

public class B_Ex01_sign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 회원가입을해서 정보를 저장하고 수정이 가능하고
		// 로그인/로그아웃이 가능한 코드를 작성해라

		Scanner sc = new Scanner(System.in);
		String name = "";
		String id = "1";
		String pw = "1";
		boolean loginSuccess = false;
		boolean run = true;

		while (run) {

			if (loginSuccess) {

				System.out.println("1.회원정보수정 2.로그아웃 0.종료");
				System.out.print("메뉴선택 > ");
				int menu2 = sc.nextInt();

				if (menu2 == 1) {
					System.out.println("=====회원가입=====");
					System.out.print("새로운 아이디를 입력해주세요 > ");
					id = sc.next();
					System.out.print("새로운 비밀번호를 입력해주세요 > ");
					pw = sc.next();
					System.out.println("새로운 id/pw가 설정되었습니다 > ");
				} else if (menu2 == 2) {

				} else if (menu2 == 0) {
					System.out.print("종료되었습니다");
					run = false;
				} else {
					System.out.println("1.회원가입 2.로그인 0.종료");
					System.out.print("메뉴선택 > ");
					int menu = sc.nextInt();
				}

			}

			System.out.println("1.회원가입 2.로그인 0.종료");
			System.out.print("메뉴선택 > ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("=====회원가입=====");
				System.out.print("아이디를 입력해주세요 > ");
				id = sc.next();
				System.out.print("비밀번호를 입력해주세요 > ");
				pw = sc.next();
				System.out.println("회원가입을 축하합니다");

			} else if (menu == 2) {
				System.out.println("=====로그인시스템=====");
				System.out.print("아이디를 입력해주세요 > ");
				String loginId = sc.next();
				System.out.print("비밀번호를 입력해주세요 > ");
				String loginPw = sc.next();

				if (loginId.equals(id) && loginPw.equals(pw)) {
					System.out.println("로그인 성공했습니다");
					loginSuccess = true;
				} else {
					System.out.println("로그인 실패입니다");
				}
			} else if (menu == 0) {
				System.out.print("종료되었습니다");
				run = false;

			}
		}

	}

}
