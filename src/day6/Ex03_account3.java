package day6;

import java.util.Scanner;

public class Ex03_account3 {

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
				String nName = "", nAccount = "";
				int nBalance = 0;
				
				System.out.print("예금주명> ");
				nName = sc.next();
				System.out.print("계좌번호> ");
				nAccount = sc.next();
				System.out.print("초기입금금액> ");
				nBalance = sc.nextInt();
				
				//계좌 개설시 동일한 계좌번호가 없는지 확인하여 없어야만 계좌 개설이 가능함
//				int countIndex = -1;
				if(cnt == 0) {
					name[cnt] = nName;
					account[cnt] = nAccount;
					balance[cnt] = nBalance;
					System.out.println(name[cnt] + "님 계좌가 개설되었습니다.");
					
					cnt++;
				} else {
					for(int i = 0; i < cnt; i++) {
						if(nAccount.equals(account[i])) {
//							countIndex = i;
							System.out.println("동일 계좌번호가 있습니다.\n" + nAccount + "를 제외한 계좌번호를 입력하세요.");
							break;
						} else if(i == cnt-1) {
							name[cnt] = nName;
							account[cnt] = nAccount;
							balance[cnt] = nBalance;
							System.out.println(name[cnt] + "님 계좌가 개설되었습니다.");
							
							cnt++;
							break;
						}
					}
					//동일 계좌번호 확인하는 방법 ver.2
//					if(countIndex == -1) {
//						name[cnt] = nName;
//						account[cnt] = nAccount;
//						balance[cnt] = nBalance;
//						System.out.println(name[cnt] + "님 계좌가 개설되었습니다.");
//						
//						cnt++;
//					}
				}
				
			} else if(menu == 2) {
				System.out.print("입금할 계좌> ");
				inputAccount = sc.next();
								
				//입금 금액을 1보다 작게 입력하면 큰 금액을 입력할 때까지 입금금액 받음
				while(true) {
					System.out.print("입금금액> ");
					inputBalance = sc.nextInt();
					if(inputBalance < 0) {
						System.out.println("0보다 큰 금액 입력필요");
					} else {
						break;
					}
				}
				
				for(int i = 0; i < cnt; i++) {
					if(inputAccount.equals(account[i])) {
						balance[i] += inputBalance;
						System.out.println(account[i] + "계좌의 잔액은 " + balance[i] + "원 입니다.");
						break;
					} else if(i == cnt-1) {
						System.out.println("계좌번호 확인필요");
					}
				}
				
			} else if(menu == 3) {
				System.out.print("출금할 계좌> ");
				inputAccount = sc.next();
				System.out.print("출금금액> ");
				inputBalance = sc.nextInt();
//				boolean ok = false;
//				
//				for(int i = 0; i < cnt; i++) {
//					if(inputAccount.equals(account[i])) {
//						if(balance[i] >= inputBalance) {
//							balance[i] -= inputBalance;
//							System.out.println("출금 완료");
//						} else {
//							System.out.println("잔액 부족");
//						}
//						ok = true;
//						break;
//					}
//				}
//				if(!ok) {
//					System.out.println("잘못된 계좌번호");
//				} 
				
				for(int i = 0; i < cnt; i++) {
					if(inputBalance < 0) {
						System.out.println("0보다 큰 금액 입력필요");
						break;
					} else {
						if(inputAccount.equals(account[i])) {
							if(balance[i] >= inputBalance) {
								balance[i] -= inputBalance;
								System.out.println("출금 완료");
							} else {
								System.out.println("잔액 부족");
							}
							break;
						} else if(i == cnt-1) {
							System.out.println("잘못된 계좌번호");
						}						
					}
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
								System.out.println("출금 계좌번호 확인필요");
							}
						}
						break;
					} else if(i == cnt-1) {
						System.out.println("입금 계좌번호 확인필요");
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