package day6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class B_Ex02_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열을 이용한 회원가입/로그인 시스템 만들기

		Scanner sc = new Scanner(System.in);
		String[] name = new String[100];
		String[] id = new String[100];
		String[] pw = new String[100];
		String[] date = new String[100];
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/mm/dd hh:mm:ss"); // 현재날짜를 포멧의 형식으로 변경해주는

		int cnt = 0;

		while (true) {
			System.out.println("=====회원가입=====");
			System.out.println("1.회원가입 2.로그인 3.리스트 0.종료");
			System.out.print("메뉴선택 >  ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("이름을 입력하세요 >  ");
				name[cnt] = sc.next();
				System.out.print("새로운 아이디를 입력하세요 >  ");
				id[cnt] = sc.next();
				System.out.print("새로운 비밀번호를 입력하세요 >  ");
				pw[cnt] = sc.next();
				LocalDateTime now = LocalDateTime.now();
				date[cnt] = dtf.format(now); // 가입날짜

				System.out.println(name[cnt] + "님회원가입완료!");
				cnt++;

			} else if (menu == 2) {

				System.out.print("로그인할 아이디를 입력하세요 >  ");
				String loginId = sc.next();
				System.out.print("로그인할 비밀번호를 입력하세요 >  ");
				String loginPw = sc.next();
				boolean loginCheck = false;

				for (int i = 0; i < cnt; i++) {
					if (loginId.equals(id[i]) && loginPw.equals(pw[i])) {
						System.out.println(name[i] + "님 로그인 성공");
						loginCheck = true;
						break;
					}

				}
				if (!loginCheck) {
					System.out.println("로그인 실패");
				}

			} else if (menu == 3) {
				System.out.println("이름\t 아이디\t 비밀번호\t 가입날짜");
				System.out.println("=============================");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t %s\t %s \t %s \n", name[i], id[i], pw[i], date[i]);
				}

			} else if (menu == 0) {
				break;
			}
		}

		System.out.println("프로그램종료");
	}

}
