package day3;

import java.util.Scanner;

public class h_조별프로젝트1_pc방주문프로그램2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String list = " \n";
		long money = 10000;
		while(true) {
			System.out.println("===========Menu===========\n\t  현재잔액 : "+money+"원");
			System.out.println("\n\t  전체메뉴");
			System.out.println("\n1.밥류\t\t2.면류\n김치볶음밥\t\t신라면\n새우볶음밥\t\t짜파게티\n고기덮밥\n돈까스덮밥\n공기밥"+"\n");
			System.out.print("메뉴를 선택하세요> ");
			int menu = sc.nextInt();
			if(menu==1) {
				System.out.println("1.밥류\n1)볶음밥(5,000원) 2)덮밥(6,000원) 3)공기밥(1,000원)\n");
				System.out.print("종류를 선택하세요> ");
				int b = sc.nextInt();
				if(b == 1){
					System.out.println("1)볶음밥(5,000원)\n1.김치볶음밥\t2.새우볶음밥\n");
					System.out.print("종류를 선택하세요> ");
					int b1 = sc.nextInt();
					if(b1 == 1) {
						money = money-5000;
						
						System.out.println("1.김치볶음밥\n");
						System.out.println("현재잔액 "+money+"원\n");
					}else if(b1 == 2) {
						money = money-5000;
						
						System.out.println("2.새우볶음밥\n");
						System.out.println("현재잔액 "+money+"원\n");
					}
				}else if(b == 2) {
					System.out.println("2)덮밥(6,000원)\n1.고기덮밥\t 2.돈까스덮밥\n");
					System.out.print("종류를 선택하세요> ");
					int b2 = sc.nextInt();
					if(b2 == 1) {
						money = money-6000;
						
						System.out.println("1.고기덮밥\n");
						System.out.println("현재잔액 "+money+"원\n");
					}else if(b2 == 2) {
						money = money-6000;
						
						System.out.println("2.돈까스덮밥\n");
						System.out.println("현재잔액 "+money+"원\n");
					}
				}else if(b == 3) {
					money = money-1000;
					System.out.println("3)공기밥(1,000원)\n");
					System.out.println("현재잔액 "+money+"원\n");
				}
			}else if(menu==2) {
				System.out.println("1.면류\n1)신라면(3,000원) 2)짜파게티(4,000원)\n");
				System.out.print("종류를 선택하세요> ");
				int m1 = sc.nextInt();
				if(m1 == 1) {
					money = money-3000;
					System.out.println("1.신라면\n");
					System.out.println("현재잔액 "+money+"원\n");
				}else if(m1 == 2) {
					money = money-4000;
					System.out.println("2.짜파게티\n");
					System.out.println("현재잔액 "+money+"원\n");
				}
				
			}
			if(money < 0) {
				System.out.println("잔액이 부족합니다\n충전하시겠습니까?");
				System.out.println("1.충전하기 \t2.아니요");
				System.out.print("선택하기> \t");
				int cash = sc.nextInt();
				if(cash == 1) {
					System.out.print("충전하기: ");
					int cash1 = sc.nextInt();
					money = money+cash1;
				}else if(cash == 2) {
					break;
				}
			}
		}
	}

}