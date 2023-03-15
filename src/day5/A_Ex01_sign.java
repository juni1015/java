package day5;

import java.util.Scanner;

public class A_Ex01_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = "";
		String id = "";
		String pw = "";
		boolean loginOk = false;
		while(true) {
			if(loginOk) {
				System.out.println("1.비밀번호 수정 2.로그아웃 0.종료");
			}else {
				System.out.println("1.회원가입 2.로그인 0.종료");
			}
			System.out.print("메뉴선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				if(loginOk) {
					System.out.print("수정할 비밀번호> ");
					pw = sc.next();
					System.out.println("비밀번호 수정 완료");
				}else {
					System.out.print("이름입력> ");
					name = sc.next();
					System.out.print("아이디입력> ");
					id = sc.next();
					System.out.print("비밀번호입력> ");
					pw = sc.next();
					System.out.println(name+"님 회원가입을 축하드립니다");
				}
			}else if(menu == 2) {
				if(loginOk) {
					loginOk = false;
					System.out.println("로그아웃 성공");
				}else {
					System.out.print("아이디입력> ");
					String loginId = sc.next();
					System.out.print("비밀번호입력> ");
					String loginPw = sc.next();
					
					if(loginId.equals(id) && loginPw.equals(pw)) {
						System.out.println("로그인 성공");
						loginOk = true;
					}else {
						System.out.println("로그인 실패");
					}
				}
			}else if(menu == 0) {
				break;
			}else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}

}

