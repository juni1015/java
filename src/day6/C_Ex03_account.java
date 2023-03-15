package day6;

import java.util.Scanner;

public class C_Ex03_account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] name = new String[100];
		String[] account = new String[100];
		int[] balance = new int[100];
		int cnt = 0;

		while (true) {
			System.out.println("======인천일보은행======");
			System.out.println("1.계좌생성 2.입금 3.출금 4.계좌이체 5.계좌목록 0.종료");
			System.out.print("메뉴선택 >");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("예금주명> ");
				name[cnt] = sc.next();
				System.out.print("게좌번호> ");
				account[cnt] = sc.next();
				System.out.print("초기입금금액> ");
				balance[cnt] = sc.nextInt();
				System.out.println(name[cnt] + "님 계좌가 개설되었습니다!");
				cnt++;
			} else if (menu == 2) {
				System.out.print("입금할계좌> ");
				String dAccount = sc.next();
				System.out.print("입금금액");
				int deposit = sc.nextInt();

				for (int i = 0; i < cnt; i++) {
					if (dAccount.equals(account[i])) {
						balance[i] += deposit;
						System.out.println("입금완료");
						break;
					} else if (i == cnt - 1) { // 마지막 반복되기전까지는 찍지 않기위해
						System.out.println("잘못된 계좌입니다");
					}
				}

			} else if (menu == 3) {
				System.out.print("출금할계좌> ");
				String wAccount = sc.next();
				System.out.print("출금금액> ");
				int whithdraw = sc.nextInt();
				boolean accountCheck = false;

				for (int i = 0; i < cnt; i++) {
					if (wAccount.equals(account[i])) {
						if (balance[i] >= whithdraw) {
							balance[i] -= whithdraw;
							System.out.println("출금완료");
						} else {
							System.out.println("잔액부족");

						}
						accountCheck = true;
						break;
					}
				}
				if (!accountCheck) {
					System.out.println("잘못된 계좌번호입니다");

				}
			} else if (menu == 4) {
				System.out.print("출금할계좌> ");
				String wAccount = sc.next();
				System.out.print("입금할계좌> ");
				String dAccount = sc.next();
				System.out.print("계좌이체금액> ");
				int deposit = sc.nextInt();

				for (int i = 0; i < cnt; i++) {
					if (wAccount.equals(account[i])) {
						for (int j = 0; j < cnt; j++) {
							if (balance[i] < deposit) {
								System.out.println("잔액이 부족합니다");
								break;
							}
							if (dAccount.equals(account[j])) {

								balance[i] -= deposit;
								balance[j] += deposit;
								System.out.println("출금계좌 잔액은 " + balance[i] + "입니다");
								System.out.println("입금계좌 잔액은 " + balance[j] + "입니다");
								break;
							}else if (j == cnt - 1  ) {
								System.out.println("입금/출금 계좌번호가 잘못 입력됐습니다.");
							}
							else if (j == cnt - 1) {
								System.out.println("입금계좌번호가 잘못 입력됐습니다.");
							}

						}
						break;
					} else if (i == cnt - 1) {
						System.out.println("출금계좌번호가 잘못 입력됐습니다.");
					}
				}

			} else if (menu == 5) {
				System.out.println("예금주\t계좌번호\t잔액");
				System.out.println("---------------------------");
				for (int i = 0; i < cnt; i++) {
					System.out.printf("%s\t%s\t%,d\n", name[i], account[i], balance[i]);
				}

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}

		}
		System.out.println("프로그램 종료");
	}

}
