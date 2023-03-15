package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Bank> list = new ArrayList<>();
		
		while(true) {
			System.out.println("=====은행=====");
			System.out.println("1.계좌생성 2.리스트 3.입금 4.출금 5.계좌이체 6.조회 0.종료");
			System.out.print("메뉴 선택> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				Bank bank = new Bank();
				System.out.print("계좌번호> ");
				bank.setAccount(sc.next());
				System.out.print("예금주> ");
				bank.setName(sc.next());
				System.out.print("초기입금금액> ");
				bank.setBalance(sc.nextLong());
				list.add(bank);
				System.out.println("계좌생성");
			} else if(menu == 2) {
				System.out.println("계좌번호\t\t예금주\t잔액");
				System.out.println("------------------------------");
				for(Bank b : list) {
					b.print();
				}
			} else if(menu == 3) {
				System.out.print("입금계좌> ");
				String account = sc.next();
				boolean find = false;
				for(Bank b : list) {
					if(account.equals(b.getAccount())) {
						System.out.print("입금금액> ");
						int money = sc.nextInt();
//						b.setBalance(b.getBalance() + money);
						b.deposit(money);
						System.out.println("입금완료");
						find = true;
						break;
					}
				}
				if(!find) {
					System.out.println("계좌오류");
				}
			} else if(menu == 4) {
				System.out.print("출금계좌> ");
				String account = sc.next();
				boolean find = false;
				for(Bank b : list) {
					if(account.equals(b.getAccount())) {
						System.out.print("출금금액> ");
						int money = sc.nextInt();
						if(b.withdraw(money)) {
							System.out.println("출금완료");
							break;
						} else {
							System.out.println("잔액부족");
						}
						find = true;
					}
				}
				if(!find) {
					System.out.println("계좌오류");
				}
			} else if(menu == 5) {
				System.out.print("출금계좌> ");
				String withdrawAccount = sc.next();
				System.out.print("입금계좌> ");
				String depositAccount = sc.next();
				
				Bank w = null;
				Bank d = null;
				
				for(Bank b : list) {
					if(withdrawAccount.equals(b.getAccount())) {
						w = b;
					}
					if(depositAccount.equals(b.getAccount())) {
						d = b;
					}
				}
				
				if(w == null) {
					System.out.println("출금계좌 없음");
				} else if(d == null) {
					System.out.println("입금계좌 없음");
				} else {
					System.out.print("계좌이체금액> ");
					int money = sc.nextInt();
					if(w.withdraw(money)) {
						d.deposit(money);
						System.out.println("계좌이체 완료");
					} else {
						System.out.println("잔액부족");
					}
				}
				
//				String index;
//				for(Bank b : list) {
//					if(depositAccount.equals(b.getAccount())) {
//						index = b.getAccount();
//					}
//				}
//				if(index != null) {
//					for(Bank b : list) {
//						if(withdrawAccount.equals(b.getAccount())) {
//							
//						}
//					}
//				} else {
//					
//				}
				
			} else if(menu == 6) {
				System.out.print("조회할 계좌번호> ");
				String searchAccount = sc.next();
				for(Bank b : list) {
					if(searchAccount.equals(b.getAccount())) {
						b.breakdownPrint();
					}
				}
			} else if(menu == 0) {
				break;
			} else {
				System.out.println("다시 입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}

}
