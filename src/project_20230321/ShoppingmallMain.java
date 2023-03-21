package project_20230321;

import java.util.Scanner;

public class ShoppingmallMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Util util = new Util();
		MemberService memberService = MemberService.getInstence();
		ManagerService managerService = ManagerService.getInstence();
		MenuManagement menuManagement = MenuManagement.getInstence();
		boolean loginOk = false;
		boolean menuOk = false;	//페이지분류완료 확인 
		int menu = -1;
		
		while(!menuOk) {
			System.out.println("=====쇼핑몰=====");
			System.out.println("1.관리자 2.회원");
			int memberOk = util.menu()-1;
			
			while(true) {				
				if(memberOk == 0) {
					if(loginOk) {
						System.out.println("1.마이페이지 2.정보수정 3.상품관리 4.고객리스트 5.관리자리스트 6.로그아웃 7.탈퇴 0.종료");
					} else {
						System.out.println("1.회원가입 2.로그인 3.뒤로가기 0.종료 관");
					}
				} else if(memberOk == 1) {
					if(loginOk) {
						System.out.println("1.마이페이지 2.정보수정 3.상품구매 4.장바구니 5.주문내역 6.금액충전 7.로그아웃 8.탈퇴 0.종료");
					} else {
						System.out.println("1.회원가입 2.로그인 3.뒤로가기 0.종료 유");
					}
				} else {
					System.out.println("다시입력");
					break;
				}
				menuOk = true;
				menu = util.menu();
				
				if(menu == 1) {
					if(loginOk) {
						if(memberOk == 0) {	//로그인된 관리자 마이페이지
							managerService.findById();
						} else {	//로그인된 회원 마이페이지
							memberService.findById();
						}
					} else {
						if(memberOk == 0) {	//로그인x 관리자 회원가입
							managerService.save();
						} else {	//로그인x 회원 회원가입
							memberService.save();
						}
					}
				} else if(menu == 2) {
					if(loginOk) {
						if(memberOk == 0) {	//로그인된 관리자 정보수정
							managerService.update();
						} else {	//로그인된 회원 정보수정
							memberService.update();
						}
					} else {
						if(memberOk == 0) {	//로그인x 관리자 로그인
							loginOk = managerService.loginCheck(memberOk);
						} else {	//로그인x 회원 로그인
							loginOk = memberService.loginCheck(memberOk);
						}
					}
				} else if(menu == 3) {
					if(loginOk) {
						if(memberOk == 0) {	//로그인된 관리자 상품관리
							int managementOk = 1;
							while(managementOk != 0) {
								managementOk = menuManagement.productManagement();
							}
						} else {	//로그인된 회원 상품구매
							
						}
					} else {	//로그인 x 뒤로가기
						menuOk = false;
						break;
					}
				} else if(menu == 4 && loginOk) {
					if(memberOk == 0) {	//로그인된 관리자 고객리스트
						memberService.findAll();
					} else {	//로그인된 회원 장바구니
						
					}		
				} else if(menu == 5 && loginOk) {
					if(memberOk == 0) {	//로그인된 관리자 관리자리스트
						managerService.findAll();
					} else {	//로그인된 회원 주문내역
						
					}				
				} else if(menu == 6 && loginOk) {
					if(memberOk == 0) {	//로그인된 관리자 로그아웃
						loginOk = managerService.logout();
					} else {	//로그인된 회원 금액충전
						memberService.balanceUp();
					}						
				} else if(menu == 7 && loginOk) {
					if(memberOk == 0) {	//로그인된 관리자 탈퇴
						loginOk = managerService.delete();
					} else {	//로그인된 회원 로그아웃
						loginOk = memberService.logout();
					}	
				} else if(menu == 8 && loginOk && memberOk == 1) {	//로그인된 회원 탈퇴
					loginOk = memberService.delete();
				} else if(menu == 0) {
					break;
				} else {
					System.out.println("다시 입력");
				}
			}
			if(menu != 0) {
				System.out.println();
				continue;
			}
			break;
		}
		System.out.println("프로그램 종료");

	}

}
