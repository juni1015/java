package day8;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		User[] list = new User[100];
		int cnt = 0;
		Util util = new Util();
		
		while(true) {
			System.out.println("=====회원가입=====");
			System.out.println("1.회원가입 2.로그인 3.리스트 4.검색 0.종료");
			System.out.print("메뉴 선택> ");
//			if(!sc.hasNextInt()) {
//				System.out.println("숫자만 입력");
//				sc.nextLine();
//				continue;
//			}
//			int menu = sc.nextInt();
//			int menu = util.numberCheck();
			int menu = util.numberCheck1("메뉴");
			
			if(menu == 1) {
//				System.out.print("이름 입력> ");
//				String name = sc.next();
				String name = util.lengthCheck("이름", 6);
//				System.out.print("아이디 입력> ");
//				String id = sc.next();
				String id = util.lengthCheck("아이디", 6);
//				System.out.print("패스워드 입력> ");
//				String pw = sc.next();
				String pw = util.lengthCheck("패스워드", 6);
				User user = new User(name, id, pw);
				list[cnt] = user;
				System.out.println("회원가입 완료");
				cnt++;
			} else if(menu == 2) {
				System.out.print("로그인할 아이디> ");
				String loginId = sc.next();
				System.out.print("로그인할 패스워드> ");
				String loginPw = sc.next();
				
				for(int i = 0; i < cnt; i++) {
					if(loginId.equals(list[i].getId()) && loginPw.equals(list[i].getPw())) {
						System.out.println(list[i].getName() + "님 로그인 성공");
						break;
					} else if(i == cnt-1) {
						System.out.println("로그인 실패");
					}
				}
			} else if(menu == 3) {
				System.out.println("이름\t아이디\t패스워드");
				System.out.println("-------------------------");
				for(int i = 0; i < cnt; i++) {
					list[i].print();
				}
			} else if(menu == 4) {
				System.out.print("검색할 아이디> ");
				String searchId = sc.next();
				System.out.println("이름\t아이디\t패스워드");
				System.out.println("------------------------");
				
				for(int i = 0; i < cnt; i++) {
					if(searchId.equals(list[i].getId())) {
						list[i].print();
						break;
					} else if(i == cnt-1) {
						System.out.println(searchId + "는 회원가입 되지 않은 아이디입니다.");
					}
				}
			} else if(menu == 0) {
				break;
			} else {
				System.out.println("메뉴 다시입력");
			}
		}
		System.out.println("프로그램 종료");

	}

}
