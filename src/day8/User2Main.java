package day8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<User2> list = new ArrayList<>();
		Util2 util2 = new Util2();
		boolean login = false;
//		User2 loginUser = null;
		
		while(true) {
			if(login) {
				System.out.println("1.비밀번호수정 2.로그아웃 3.리스트 4.회원탈퇴 0.종료");	
			} else {
				System.out.println("1.회원가입 2.로그인 3.리스트 0.종료");
			}
						
			System.out.print("메뉴 선택> ");
//			int menu = sc.nextInt();
			int menu = util2.numCheck();
			
			if(menu == 1) {
				if(login) {
					
				} else {
					User2 user = new User2();	//user 객체 생성
					System.out.print("이름 입력> ");
					user.setName(sc.next());
					System.out.print("아이디 입력> ");
//					user.setId(sc.next());
//					user.setId(util2.lengthCheck(6));
					String id = util2.duCheck(list);
					user.setId(id);	//이렇게 하면 아이디 길이체크 안 됨
					System.out.print("패스워드 입력> ");
					user.setPw(sc.next());
					list.add(user);
					System.out.println("반갑습니다. " + user.getName() + "님 회원가입 완료");
				}
				
			} else if(menu == 2) {
				if(login) {
					login = false;
					System.out.println("로그아웃");
				} else {
					System.out.print("로그인할 아이디> ");
					String loginId = sc.next();
					System.out.print("로그인할 패스워드> ");
					String loginPw = sc.next();
					boolean find = false;
					
					for(User2 u : list) {
						if(loginId.equals(u.getId()) && loginPw.equals(u.getPw())) {
							System.out.println("로그인 성공");
//							loginUser = u;
							login = true;
							find = true;
							break;
						}
					}
					if(!find) {
						System.out.println("로그인 실패");
					}
				}
				
			} else if(menu == 3) {
				System.out.println("이름\t아이디\t패스워드\t가입일");
				System.out.println("-------------------------------");
				for(User2 u : list) {
					u.print();
				}
			} else if(menu == 0) {
				break;
			} else {
				System.out.println("다시 입력");
			}
		}
		System.out.println("프로그램 종료");

	}

}
