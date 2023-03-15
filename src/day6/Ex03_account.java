package day6;

import java.util.Scanner;

public class Ex03_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String [] name = new String[100];
		String [] account = new String[100];
		int [] balance = new int[100];
		int cnt = 0;
		
		while(true) {
			System.out.println("=====인천일보은행=====");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌이체 5.계좌목록 0.종료");
			System.out.print("메뉴 선택> ");
			int menu = sc.nextInt();
			String inputAccount = "";
			int inputBalance = 0;
			
			if(menu == 1) {
				System.out.print("예금주명> ");
				name[cnt] = sc.next();
				System.out.print("계좌번호> ");
				account[cnt] = sc.next();
				System.out.print("초기입금금액> ");
				balance[cnt] = sc.nextInt();
				System.out.println(name[cnt] + "님 계좌가 개설되었습니다.");
				
				cnt++;
				
			} else if(menu == 2) {
				System.out.print("입금할 계좌> ");
				inputAccount = sc.next();
				System.out.print("입금금액> ");
				inputBalance = sc.nextInt();
				
				boolean ok = false;
				for(int i = 0; i < cnt; i++) {
					if(inputAccount.equals(account[i])) {
						balance[i] += inputBalance;
						System.out.println("입금완료");
						break;
					} else if(i == cnt - 1) {
						System.out.println("계좌번호 확인필요");
					}
				}
				
			} else if(menu == 3) {
				System.out.print("출금할 계좌> ");
				inputAccount = sc.next();
				System.out.print("출금금액> ");
				inputBalance = sc.nextInt();
				boolean ok = false;
				
				for(int i = 0; i < cnt; i++) {
					if(inputAccount.equals(account[i])) {
						if(balance[i] >= inputBalance) {
							balance[i] -= inputBalance;
							System.out.println("출금 완료");
						} else {
							System.out.println("잔액 부족");
						}
						ok = true;
						break;
					}
				}
				if(!ok) {
					System.out.println("잘못된 계좌번호");
				} 
				
			} else if(menu == 4) {
				System.out.print("출금할 계좌> ");
				inputAccount = sc.next();
				System.out.print("입금할 계좌> ");
				String inputAccount2 = sc.next();
				System.out.print("계좌이체금액> ");
				inputBalance = sc.nextInt();
				
				for(int i = 0; i < cnt; i++) {
					if(inputAccount.equals(account[i])) {
//						int index = i;
						for(int j = 0; j < cnt; j++) {
							if(inputAccount2.equals(account[j])) {
								if(inputBalance <= balance[i]) {
									balance[i] -= inputBalance;
									balance[j] += inputBalance;
									System.out.println("계좌이체 완료");
								} else {
									System.out.println("입금계좌의 잔액 확인필요");
								}
								break;
							} else if(j == cnt-1) {
								System.out.println("입금 계좌번호 확인필요");
							}
						}
						break;
					} else if(i == cnt-1) {
						System.out.println("출금 계좌번호 확인필요");
					}
				}
				
			} else if(menu == 5) {
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("------------------------------");
				for(int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%d\n", name[i], account[i], balance[i]);
				}
			} else if(menu == 0) {
				break;
			} else {
				System.out.println("다시 입력");
			}
		}

	}

}
