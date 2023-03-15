package day5;

import java.util.Scanner;

public class Ex01_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		String id = "test";
		String pw = "1234";
		boolean ok = false;
		
		while(true) {
			System.out.println("=====회원가입=====");
			
			if(ok) {
				System.out.printf("1.패스워드 변경 2.로그아웃(%s님) 0.종료\n", name);
			} else {
				System.out.println("1.회원가입 2.로그인 0.종료");
			}
			
			System.out.print("메뉴 선택> ");
			int menu = sc.nextInt();
			
			
			if(menu == 1) {
				if(ok) {
					System.out.print("변경할 패스워드 입력> ");
					pw = sc.next();
				} else {
					System.out.print("이름 입력> ");
					name = sc.next();
					System.out.print("아이디 입력> ");
					id = sc.next();
					System.out.print("패스워드 입력> ");
					pw = sc.next();		
					System.out.printf("%s님 회원가입을 축하드립니다.\n", name);			
				}
			} else if(menu == 2) {
				if(ok) {
					System.out.printf("%s님 로그아웃\n", name);
					ok = false;
				} else {
					System.out.print("아이디 입력> ");
					String loginId = sc.next();
					System.out.print("패스워드 입력> ");
					String loginPw = sc.next();	
					
					if(loginId.equals(id) && loginPw.equals(pw)) {
						System.out.println("로그인 성공");
						ok = true;
					} else {
						System.out.println("로그인 실패");
					}
				}
			} else if(menu == 0 ) {
				break;
			} else {
				System.out.println("메뉴 다시 선택");
			}
			
		}
		System.out.println("프로그램 종료");

	}

}
