package day6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex02_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String [] name = new String[100];
		String [] id = new String[100];
		String [] pw = new String[100];
		String [] date = new String[100];
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		int cnt = 0;
		
		while(true) {
			System.out.println("=====회원가입=====");
			System.out.println("1.회원가입 2.로그인 3.리스트 0.종료");
			System.out.print("메뉴 선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				System.out.print("이름 입력> ");
				name[cnt] = sc.next();
				System.out.print("아이디 입력> ");
				id[cnt] = sc.next();
				System.out.print("패스워드 입력> ");
				pw[cnt] = sc.next();
				LocalDateTime now = LocalDateTime.now();
				date[cnt] = dtf.format(now);
				System.out.println(name[cnt] + "님 회원가입을 축하드립니다.");
				
				cnt++;
			} else if(menu == 2) {
				System.out.print("로그인할 아이디 입력> ");
				String loginId = sc.next();
				System.out.print("로그인할 패스워드 입력> ");
				String loginPw = sc.next();
				
				boolean ok = false;				
				for(int i = 0; i < cnt; i++) {
					if(loginId.equals(id[i]) && loginPw.equals(pw[i])) {
						System.out.println(name[i] + "님 로그인 성공");
						ok = true;
						break;
					} else if(loginId.equals(id[i]) || loginPw.equals(pw[i])) {
						if(!(loginId.equals(id[i]))) {
							System.out.println("아이디 확인필요");
						} else {
							System.out.println("패스워드 확인필요");
						}
					}
				}

				if(!ok) {
					System.out.println("로그인 실패");
				}
				
				//위 로그인 성공 실패 ver.2
//				for(int i = 0; i < cnt; i++) {
//					if(loginId.equals(id[i]) && loginPw.equals(pw[i])) {
//						System.out.println(name[i] + "님 로그인 성공");
//						break;
//					} else if(i == cnt-1) {
//						System.out.println("로그인 실패");
//					}
//				}
				
			} else if(menu == 3) {
				System.out.println("이름\t아이디\t비밀번호\t가입날짜");
				System.out.println("----------------------------------");
				
				for(int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%s\t%s\n", name[i], id[i], pw[i], date[i]);
				}
				System.out.println();
			} else if(menu == 0) {
				break;
			} else {
				System.out.println("다시 입력");
			}
		}

	}

}
