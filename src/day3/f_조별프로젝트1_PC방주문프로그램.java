package day3;

import java.util.Scanner;

public class f_조별프로젝트1_PC방주문프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 문제 )) 1.콜라 2.사이다 3.우유 0.종료 중 하나를
		// 입력받아 선택한 메뉴는 출력해서 나타내고
		// 0이 입력되면 종료되는 자판기 프로그램을 작성해라

		Scanner sc = new Scanner(System.in);
		long money = 10000;

		int num = 1;
		int a = 3;
		int b = 2; 
		int c = 1;
		int d = 1;

		while (num != 0) {
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println(" \t\t\t ※인천일보 PC방※ \t\t\t   ");
			System.out.println(" \t\t\t               \t\t\t   ");
			System.out.println(" \t\t                  " + "     남은금액 : " + money + "원");
			System.out.println(" \t\t\t               \t\t\t   ");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			System.out.println(" \t\t      원하시는 메뉴를 선택해주세요 \t\t   ");
			System.out.println(" \t\t\t               \t\t\t   ");
			System.out.println(" \t\t\t               \t\t\t   ");
			System.out.println("      1.전체메뉴  2.밥류  3.면류  4.간식류  5.카페  6.기타         ");
			System.out.println(" \t\t\t               \t\t\t   ");
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			num = sc.nextInt();

			if (num == 2) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println(" \t\t\t ※인천일보 PC방※ \t\t\t   ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println(" \t\t                  " + "     남은금액 : " + money + "원");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println(" \t\t      원하시는 메뉴를 선택해주세요 \t\t   ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println("  1.김치볶음밥  2.새우볶음밥  3.스팸김치볶음밥  4.치킨데리야끼볶음밥  5.치킨마요 ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				c = sc.nextInt();

				if (c == 1) {
					money = money - 2000;
					System.out.print("김치볶음밥 주문완료!\n\n");
					System.out.print("추가주문하시겠습니까?\n\n");
					System.out.print("1.예  2.아니요\n\n");
					b = sc.nextInt();
					

				} else if (c == 2) {
					money = money - 3000;
					System.out.print("새우볶음밥!\n\n");
					System.out.print("추가주문하시겠습니까?\n\n");
					System.out.print("1.예  2.아니요\n\n");
					b = sc.nextInt();
				} else if (c == 3) {
					money = money - 4000;
					System.out.print("스팸김치볶음밥!\n\n");
					System.out.print("추가주문하시겠습니까?\n\n");
					System.out.print("1.예  2.아니요\n\n");
					b = sc.nextInt();
				} else if (c == 5000) {
					System.out.print("치킨데리야끼볶음밥\n\n");
					System.out.print("추가주문하시겠습니까?\n\n");
					System.out.print("1.예  2.아니요\n\n");
					b = sc.nextInt();
				} else if (c == 3000) {
					System.out.print("치킨마요\n\n");
					System.out.print("추가주문하시겠습니까?\n\n");
					System.out.print("1.예  2.아니요\n\n");
					b = sc.nextInt();

				}
			}else if(num == 3) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println(" \t\t\t ※인천일보 PC방※ \t\t\t   ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println(" \t\t                  " + "     남은금액 : " + money + "원");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println(" \t\t      원하시는 메뉴를 선택해주세요 \t\t   ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println("  1.신라면  2.진라면  3.불닭볶음면  4.간짬뽕  5.짜파게티 ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				c = sc.nextInt();

				if (c == 1) {
					money = money - 2000;
					System.out.print("신라면 주문완료!\n\n");
					System.out.print("추가주문하시겠습니까?\n\n");
					System.out.print("1.예  2.아니요\n\n");
					b = sc.nextInt();
					

				} else if (c == 2) {
					money = money - 3000;
					System.out.print("진라면!\n\n");
					System.out.print("추가주문하시겠습니까?\n\n");
					System.out.print("1.예  2.아니요\n\n");
					b = sc.nextInt();
				} else if (c == 3) {
					money = money - 4000;
					System.out.print("불닭볶음면!\n\n");
					System.out.print("추가주문하시겠습니까?\n\n");
					System.out.print("1.예  2.아니요\n\n");
					b = sc.nextInt();
				} else if (c == 5000) {
					System.out.print("간짬뽕\n\n");
					System.out.print("추가주문하시겠습니까?\n\n");
					System.out.print("1.예  2.아니요\n\n");
					b = sc.nextInt();
				} else if (c == 3000) {
					System.out.print("짜파게티\n\n");
					System.out.print("추가주문하시겠습니까?\n\n");
					System.out.print("1.예  2.아니요\n\n");
					b = sc.nextInt();}
			}else if(num == 4) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println(" \t\t\t ※인천일보 PC방※ \t\t\t   ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println(" \t\t                  " + "     남은금액 : " + money + "원");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println(" \t\t      원하시는 메뉴를 선택해주세요 \t\t   ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println("  1.치킨가라아게  2.감자튀김  3.핫도그  4.새우깡  5.꼬북칩초코 ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				d = sc.nextInt();

				if (d == 1) {
					money = money - 2000;
					System.out.print("치킨가라아게 주문완료!\n\n");
					System.out.print("추가주문하시겠습니까?\n\n");
					System.out.print("1.예  2.아니요\n\n");
					b = sc.nextInt();
					

				} else if (d == 2) {
					money = money - 3000;
					System.out.print("감자튀김!\n\n");
					System.out.print("추가주문하시겠습니까?\n\n");
					System.out.print("1.예  2.아니요\n\n");
					b = sc.nextInt();
				} else if (d == 3) {
					money = money - 4000;
					System.out.print("핫도그!\n\n");
					System.out.print("추가주문하시겠습니까?\n\n");
					System.out.print("1.예  2.아니요\n\n");
					b = sc.nextInt();
				} else if (d == 5000) {
					System.out.print("새우깡\n\n");
					System.out.print("추가주문하시겠습니까?\n\n");
					System.out.print("1.예  2.아니요\n\n");
					b = sc.nextInt();
				} else if (d == 3000) {
					System.out.print("꼬북칩초코\n\n");
					System.out.print("추가주문하시겠습니까?\n\n");
					System.out.print("1.예  2.아니요\n\n");
					b = sc.nextInt();
				}

			if (b == 1) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println(" \t\t\t ※인천일보 PC방※ \t\t\t   ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println(" \t\t                  " + "     남은금액 : " + money + "원");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println(" \t\t      원하시는 메뉴를 선택해주세요 \t\t   ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println("  1.신라면  2.진라면  3.불닭볶음면  4.간짬뽕  5.짜파게티 ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				num = sc.nextInt();



				}

			
			}else {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
				System.out.println(" \t\t\t ※인천일보 PC방※ \t\t\t   ");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println(" \t\t                  " + "     남은금액 : " + money + "원");
				System.out.println(" \t\t\t               \t\t\t   ");
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
			}
			
			System.out.print("주문해주셔서 감사합니다.\n\n");
			break;
		}
			
	}
}

